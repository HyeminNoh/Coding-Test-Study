import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer=1;
        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());
        for(int task : priorities) {
            priority.add(task);         
        }
        while(!priority.isEmpty()) {
            for(int i=0;i<priorities.length;i++) {
                if(priorities[i]==(int)priority.peek()) {
                    if(i==location) {
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
public class printer{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(s.solution(priorities, location));
        // test case answer is 1
    }
}