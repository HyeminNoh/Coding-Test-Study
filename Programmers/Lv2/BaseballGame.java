import java.util.*;

class Solution {
    public int solution(int[][] baseball) {
        int answer = 0;
        int strike = 0;
        int ball = 0;
        boolean flag = true;
        String num1 = "";
        String num2 = "";

        for (int i = 123; i <= 987; i++) {
            num1 = Integer.toString(i);
            if (num1.charAt(0) == num1.charAt(1) || num1.charAt(0) == num1.charAt(2) || num1.charAt(1) == num1.charAt(2))
                continue;
            else if (num1.charAt(0) == '0' || num1.charAt(1) == '0' || num1.charAt(2) == '0')
                continue;
            flag = true;
            for (int j = 0; j < baseball.length; j++) {     
                strike = 0;
                ball = 0;
                for (int a = 0; a < 3; a++) {
                    for (int b = 0; b < 3; b++) {
                        num2 =Integer.toString(baseball[j][0]);
                        if (a == b&&num1.charAt(a) == num2.charAt(b))
                        {
                            strike++;
                            continue;
                        }
                        if (a != b&&num1.charAt(a) == num2.charAt(b)) {
                            ball++;
                            continue;
                        }
                    }
                }

                if (strike != baseball[j][1] || ball != baseball[j][2]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                answer++;
            }
        }
        return answer;
    }
}

public class BaseballGame{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
        s.solution(baseball);
        //test answer is 2
    }
}