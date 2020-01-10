class Solution6 {
    public int solution(int n) {
        return fibo(n)%1234567;
    }
      public static int fibo(int n) {
          if (n <= 1)
              return n;
          else
              return fibo(n-2) + fibo(n-1);
      }
  }
class Solution7{
    public int solution(int n) {
        int[] d = new int[n + 1];
        d[0] = 0;
        d[1] = 1;
        d[2] = 1;
        for (int i = 3; i <= n; i++) {
        d[i] = (d[i - 1] + d[i - 2]) % 1234567;
        }
        return d[n];
    }
}

public class Fibo{
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.solution(5));
        //test case answer is 5
    }
}