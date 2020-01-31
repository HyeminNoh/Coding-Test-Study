import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        Comparator<int[]> c1 = (a,b)->{
            return a[2]-b[2];
        };
        Arrays.sort(costs,c1);
        boolean[] bridge = new boolean[costs.length];   // 다리를 건설 했는지
        boolean[] visit = new boolean[n];   // 섬에 방문했는지
        visit[costs[0][0]] = true;  // 최소비용의 다리를 먼저 이어줌
        visit[costs[0][1]] = true;
        bridge[0] = true;
        int answer = costs[0][2];   // 처음 건설한 다리의 비용을 추가
        int island = 2;    // 방문한 섬의 개수를 체크해줄 변수

        while(island<n) {   // 모든 섬을 방문했을 경우 더이상 다리를 건설할 필요가 없음
            for(int i=1;i<bridge.length;i++) {
                if(!bridge[i] && ((visit[costs[i][0]]&&!visit[costs[i][1]])||(visit[costs[i][1]]&&!visit[costs[i][0]]))) {
                    bridge[i] = true;
                    visit[costs[i][0]] = true;
                    visit[costs[i][1]] = true;
                    island++;
                    answer+=costs[i][2];
                    break;
                }
            }
        }
        return answer;
    }
}

public class ConnectingIsland{
    public static void main(String args[]){
        Solution s = new Solution();
        String[] test = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        s.solution(4, test);
        //test answer is 4
    }
}