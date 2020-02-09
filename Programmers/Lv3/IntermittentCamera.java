import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, new Comparator<int[]>() {
            public int compare(int[] arr1, int[] arr2) {
                if( ((Comparable)arr1[0]).compareTo(arr2[0]) > 0 ){
                    return 1;
                }
				else{
                    return -1;
                }
            }
        });
        
        int[] pre_car = routes[0];
        int cam = 1;
        for(int i=1; i<routes.length; i++){
           if(pre_car[1]>routes[i][1]){
               pre_car = routes[i];
           }
            else if(pre_car[1]<routes[i][0]){
                cam++;
                pre_car = routes[i];
            }
        }
        return cam;
    }
}

public class IntermittentCamera{
    public static void main(String args[]){
        Solution s = new Solution();
        int[][] test = {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}};
        s.solution(test);
        //test answer is 2
    }
}