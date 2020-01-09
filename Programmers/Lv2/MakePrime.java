class Solution3 {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0;
        int isPrime=0;
        for(int i = 0 ; i < nums.length - 2 ; i++) {
            for(int j = (i+1) ; j < nums.length - 1 ; j++ ) {
                for(int k = (j+1) ; k < nums.length ; k++ ) {
                    temp = nums[i] + nums[j] + nums[k];
                    for(int n = 2 ; n < (temp/2) ; n++) {
                        if(temp % n == 0) {
                            isPrime = 1;
                            break;
                        }
                    }
                    if(isPrime == 0) {
                        answer ++;
                    }
                    isPrime = 0;
                }
            }
        }
        return answer;
    }
}
public class MakePrime{
    public static void main(String[] args) {
        Solution3 s1 = new Solution3();
        int[] test_case = {1,2,7,6,4};
        System.out.println(s1.solution(test_case));
        //test case answer is 4
    }
}