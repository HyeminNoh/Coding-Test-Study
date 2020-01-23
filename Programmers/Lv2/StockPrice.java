class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            int count=0;
            for(int k=i+1; k<prices.length; k++){
                count++;
                if(prices[i]>prices[k])
                    break;
            }
            answer[i] = count;
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