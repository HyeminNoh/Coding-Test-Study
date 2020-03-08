class Solution {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        long total = 0;
        int max = budgets[0];
        int min = budgets[0];
        for(int budget:budgets){
            if(budget>max){
                max = budget;
            }
            if(budget<=min){
                min = budget;
            }
            total += budget;
        }
        int mid = (max+min)/2;
        if(total<=M){
            answer = max;
        }
        else{
            while(true){
                --mid;
                total = 0;
                for(int budget: budgets){
                    if (budget >= mid) {
                        total += mid;
                    }
                    else {
                        total += budget;
                    }
                }
                if(total<=M){
                    answer = mid;
                    break;
                }
            }
        }
        return answer;
    }
}