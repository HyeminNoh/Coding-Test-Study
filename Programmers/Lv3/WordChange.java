import java.util.*;

class Solution {
    int answer = 0;
    boolean visited[];

    public boolean difCheck(String tmp, String target){
        int cnt=0;
        for(int i=0; i<tmp.length(); i++){
            if(tmp.charAt(i)==target.charAt(i)){
                cnt++;
            }
        }
        if(cnt==tmp.length()-1){
            return true;
        }
        return false;
    }

    void bfs(int index, String[] words, String begin, String target, int stage) {
        LinkedList<Integer> queue = new LinkedList<Integer>();

        if (index == 0) {
            for (int i = 0; i < words.length; i++) {
                if (difCheck(begin, words[i]) == true) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int x = queue.getFirst();
            queue.pollFirst(); // 맨 앞에 수 빼기
            stage++;
            System.out.println(words[x]);
            if (words[x].compareTo(target)==0) {
                answer = stage;
                return;
            }
            for (int i = 0; i < words.length; i++) {
                if (visited[i] == false && difCheck(words[x], words[i])) {
                    queue.push(i);
                    visited[i] = true;
                }
            }
        }
        answer = 0;
    }

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        bfs(0, words, begin, target, 0);

        return answer;
    }
}