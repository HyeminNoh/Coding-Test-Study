class Solution {
    public int solution(int[] left, int[] right) {
        int answer = 0;
        int[][] dp = new int[left.length + 1][right.length + 1];

        for(int i = 1; i < left.length + 1; i++) {
            for(int j = 1; j < right.length + 1; j++) {
                if(left[left.length - i] > right[right.length - j]) {
                    dp[i][j] = Math.max(dp[i][j - 1] + right[right.length - j], Math.max(dp[i - 1][j], dp[i - 1][j - 1]));
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                }
            }
        }
        answer = dp[left.length][right.length];
        return answer;
    }
}