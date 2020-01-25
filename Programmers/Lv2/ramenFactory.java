import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Queue priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int index = 0;
        for (int i = 0; i < k; i++) {
            if(index < dates.length && i == dates[index])
                priorityQueue.add(supplies[index++]);

            if(stock == 0) {
                stock += (int)priorityQueue.poll();
                answer++;
            }
            stock -= 1;
        }
        return answer;
    }
}
