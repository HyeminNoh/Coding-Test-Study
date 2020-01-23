class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int x = 0;
            for (int j = i+1; j < prices.length; j++) {
                x++;
                if( prices[i] > prices[j] ){
                    break;
                }
            }
            answer[i] = x;
        }
        return answer;
    }
}

public class StockPrice{
    public static void main(String args[]){
        Solution s = new Solution();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(s.solution(prices));
        //test case answer is [4, 3, 1, 1, 0]
    }
}