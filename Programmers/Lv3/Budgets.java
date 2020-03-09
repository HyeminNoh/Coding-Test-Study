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
//통과 코
class Solution2{
    public int solution(int[] budgets, int M) {
        int answer = 0;
        int left = 0;
        int right = 0;
        for (int budget : budgets) {
            if (budget > right) {
                right = budget;
            }
        }

        int middle = 0;
        while (left <= right) {
            long sum = 0;
            middle = (left + right) / 2;

            for (int budget : budgets) {
                if (budget >= middle) {
                    sum += middle;
                }
                else {
                    sum += budget;
                }
            }

            if (sum > M) {
                right = middle - 1;
            }
            else {
                answer = middle;
                left = middle + 1;
            }
        }

        return answer;
    }
}