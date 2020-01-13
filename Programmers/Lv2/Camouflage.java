import java.util.HashMap;
class Solution8 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (int i = 0; i < clothes.length; i++) {
            if (hm.containsKey(clothes[i][1]))
                hm.replace(clothes[i][1], hm.get(clothes[i][1])+1);
            else
                hm.put(clothes[i][1], 1);
        }

        int answer = 1;
        for (int value : hm.values()) {
            answer*=(value+1);
        }
        answer-=1;
        return answer;
    }
}
public class Camouflage{
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(s.solution(clothes));
    }
}