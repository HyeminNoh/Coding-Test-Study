import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length =  citations.length;
        int h = 0;
        int k = 0;
        Arrays.sort(citations);
        for(int i =0; i<citations.length; i++){
            h=citations[i];
            k=citations.length-i;
            if(k<=h){
                answer=k;
                break;
            }
        }
        return answer;
    }
}