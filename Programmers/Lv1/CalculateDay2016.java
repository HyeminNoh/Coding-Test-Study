class Solution {
    public String solution(int a, int b) {
        int[] months = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = new String[]{"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int total = 0;
        for(int i=0; i<a-1; i++){
            total += months[i];
        }
        int select_day = (total+b-1)%7;
        return days[select_day];
    }
}

public class CalculateDay2016{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.solution(5, 24));
        //test case answer is "TUE"
    }
}