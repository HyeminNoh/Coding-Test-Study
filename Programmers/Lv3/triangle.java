class Solution {
    public int solution(int[][] triangle) {
        for(int i=1; i<triangle.length; i++){
            for(int k=0; k<triangle[i].length; k++){
                if(k==0){             
                    triangle[i][k] += triangle[i-1][k];
                }
                else if(k==triangle[i].length-1){
                    triangle[i][k] += triangle[i-1][k-1];
                }
                else{
                    if(triangle[i-1][k-1]>=triangle[i-1][k]){
                        triangle[i][k] += triangle[i-1][k-1];
                    }
                    else{
                        triangle[i][k] += triangle[i-1][k];
                    }
                }
            }
        }
        int answer = 0;
        for(int v : triangle[triangle.length-1]){
            if(v>=answer){
                answer = v;
            }
        }
        return answer;
    }
}