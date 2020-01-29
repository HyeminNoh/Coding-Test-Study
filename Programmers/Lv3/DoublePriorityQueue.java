import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue <Integer> q = new PriorityQueue<>();
        PriorityQueue <Integer> reverse_q = new PriorityQueue<>(Collections.reverseOrder());
        for(String operation : operations){
            String[] splitValue = operation.split(" ");
            
            if(splitValue[0].equals("I")){
                q.add(Integer.parseInt(splitValue[1]));
                reverse_q.add(Integer.parseInt(splitValue[1]));
            }
            
            if(splitValue[0].equals("D")){
                if(splitValue[1].equals("-1") && !q.isEmpty()){
                    int min = q.poll();
                    reverse_q.remove(min);
                }
                if(splitValue[1].equals("1") && !reverse_q.isEmpty()){
                    int max = reverse_q.poll();
                    q.remove(max);
                }
            }
        }
        int[] answer = {0, 0};
        if (!q.isEmpty()) {
            answer[0] = reverse_q.peek();
            answer[1] = q.peek();
        }
        return answer;
    }
}