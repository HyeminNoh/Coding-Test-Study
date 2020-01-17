import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};
        int[] count_answer = new int[3];
        for(int i=0; i<answers.length; i++){
            if(stu1[i%5]==answers[i])
                count_answer[0]++;
            if(stu2[i%8]==answers[i])
                count_answer[1]++;
            if(stu3[i%10]==answers[i])
                count_answer[2]++;
        }
        int max = count_answer[0];
        for (int i : count_answer) {
            if (i > max) {
                max = i;
            }
        }
        List <Integer> answer_list = new ArrayList<>();
        for (int i = 0; i < count_answer.length; i++) {
            if (count_answer[i] == max) {
                answer_list.add(i+1);
            }
        }
        int[] answer = new int[answer_list.size()];
        for(int i = 0; i < answer_list.size(); i++) answer[i] = answer_list.get(i);
        return answer;
    }
}

public class exam{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = {1,2,3,4,5};
        System.out.println(s.solution(test));
        // test case answer is [1]
    }
}