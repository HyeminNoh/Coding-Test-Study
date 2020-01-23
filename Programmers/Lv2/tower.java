import java.util.*;
class Solution {
    public int[] solution(int[] heights) {
        List <Integer> index = new ArrayList<>();
        for(int i = heights.length-1; i>0; i--){
            for(int k=i-1; k>-1; k--){
                if(heights[i]<heights[k]){
                    index.add(k+1);
                    break;
                }
                else if(k==0){
                    index.add(0);
                }
            }
        }
        index.add(0);
        Collections.reverse(index);
        int[] answer = new int[index.size()];
        for(int v=0; v<index.size(); v++){
            answer[v] = index.get(v);
        }
        return answer;
    }
}

public class tower{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = {6,9,5,7,4};
        System.out.println(s.solution(test));
        //test case answer is [0,0,2,2,4]
    }
}