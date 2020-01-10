class Solution5 {
  public int solution(int[] arr) {
        int lcm = arr[0];

        for(int i=1; i<arr.length; i++) {
            lcm = getLcm(lcm, arr[i]);
        }
        return lcm;
    }

    public int getGcd(int a, int b) {   //최대공약수 
        int tmp;
        while(b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public int getLcm(int a, int b) {   //최소공배수 
        if(a<=0 || b<=0) return -1;
        return a * b / getGcd(a, b);
    }
}

public class N_Lcm{
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        int[] testCase = {2,6,8,14};
        System.out.println(s.solution(testCase));
        //test case answer is 168
    }
}