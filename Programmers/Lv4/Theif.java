import java.util.*;

class Solution {
    public int solution(int[] money) {
        int answer = 0;
        int length = money.length;
        int[] odd = new int[length-1];
        int[] even = new int[length];

        odd[0]=money[0];
        odd[1]=money[0];
        even[0]=0;
        even[1]=money[1];
        for(int i=2;i<length-1;i++){
            odd[i]=Math.max(odd[i-2]+money[i],odd[i-1]);
        }
        for(int i=2;i<length;i++){
            even[i]=Math.max(even[i-2]+money[i],even[i-1]);
        }

        return Math.max(odd[length-2],even[length-1]);
    }
}