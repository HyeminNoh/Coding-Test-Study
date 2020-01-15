import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        if(nums.length/2>=map.size()){
            return map.size();
        }
        else{
            return nums.length/2; 
        }
    }
}
public class ponkemon{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = {3,1,2,3};
        System.out.println(s.solution(test));
        // test case answer is 2
    }
}