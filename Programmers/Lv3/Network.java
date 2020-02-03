class Solution {
    public void dfs(int[][] computers, boolean[][] link, int idx, int n){
        for(int i=0; i<n; i++){
            if(computers[idx][i]==1 && !link[idx][i]){
                link[idx][i] = link[i][idx] = true;
                dfs(computers, link, i, n);
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[][] link = new boolean[n][n];
        for(int i=0; i<n; i++){
            if(!link[i][i]){
                answer++;
                dfs(computers, link, i, n);
            }
        }
        return answer;
    }
}