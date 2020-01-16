class Solution {
    public int solution(int n) {
        int answer = 0; 
          boolean[] arr = new boolean[n+1];
          arr[0] = arr[1] = false;
          for(int i=2; i<=n; i+=1) {
              arr[i] = true;
          }
          for(int i=2; i*i<=n; i+=1) {
              for(int j=i*i; j<=n; j+=i) {
                  arr[j] = false;        
              }
          }
          for(int i=0; i<=n; i+=1) {
              if(true == arr[i]) {
                  answer += 1;
              }
          }
        return answer;
    }
  }

public class findPrime{
    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.solution(10));
        //test case answer is 4
    }
}