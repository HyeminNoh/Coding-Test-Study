import java.util.Arrays;

class Solution {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int max = people.length - 1;
        for(int i = 0; i <= max; i++, answer++){
            while(max > i && people[i] + people[max--] > limit){
                answer++;            
            }
        }
        return answer;
    }
}