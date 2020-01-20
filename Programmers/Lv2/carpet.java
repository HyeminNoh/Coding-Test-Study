import java.util.*;
class FirstSolution {
    public int[] solution(int brown, int red) {
        int total = brown+red;
        int[] answer = new int[2];
        int x;
        int y;
        int pre_x = 1;
		int div=2;
        while(true){
			if(total%div==0){
                pre_x = pre_x*div;
				total=total/div;
				if(2*pre_x+2*total-4 == brown){
                    answer[0] = pre_x;
                    answer[1] = total;
                    break;
                }
			}
            else{
				div++;
			}
		}
        return answer;
	}
}
class secondSolution {
    public int[] solution(int brown, int red) {
        int width = 0;
        int height = 0;
        
        for(int i=1; i<=red/2+1; i++) {
            width = i;            
            height = (red%i==0) ? red/i:red/i+1;
            
            if(2*width + 2*height + 4 == brown) break;
            
        }
            
        int[] answer = {Math.max(width, height)+2, Math.min(width, height)+2};
        
        return answer;
    }
}

public class carpet{
    public static void main(String args[]){
        secondSolution s = new secondSolution();
        s.solution(24, 24);
        //test answer is [8,6]
    }
}