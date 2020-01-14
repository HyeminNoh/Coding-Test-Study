import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> stringList = new ArrayList<>();

        for (int intNum : numbers) {
            stringList.add(String.valueOf(intNum));
        }
        stringList.sort(((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));
        for (String s : stringList) {
            answer += s;
        }
        return answer.charAt(0) == '0'? "0": answer;
    }
}