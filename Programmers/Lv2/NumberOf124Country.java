class Solution2 {
    public String solution(int n) {
        String answer = "";
        int[] arr = {4, 1, 2};
        int a;
        while (n > 0) {
            a = n % 3;
            n = n / 3;
            if (a == 0) {
                n -= 1;
            }
            answer = arr[a] + answer;
        }
        return answer;
    }
}
public class NumberOf124Country{
    public static void main(String[] args) {
        Solution2 s1 = new Solution2();
        System.out.println(s1.solution(9));
        //test case answer is 24
    }
}