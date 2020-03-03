import java.util.Arrays;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[m][n];
        map[0][0]=1;
        for(int[] puddle : puddles){
            map[puddle[0]-1][puddle[1]-1] = -1;
        }

        //(0,n)
        int status = 1;
        for(int k=1; k<n; k++){
            if(map[0][k]==-1){
                status=0;
            }
            map[0][k]=status;
        }
        //(m,n)
        status = 1;
        for(int l=1; l<m; l++){
            if(map[l][0]==-1){
                status=0;
            }
            map[l][0]=status;
        }
        //거리계산
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(map[i][j]==-1){
                    map[i][j]=0;
                }
                else{
                    map[i][j]=(map[i-1][j]+map[i][j-1])%1000000007;
                }
            }
        }

        return map[m-1][n-1];
    }
}