import java.util.*;

class Solution {
    boolean[] visited;
    ArrayList<String> route;

    public void bfs(String[][] tickets, String tmp){
        while(route.size()<tickets.length+1){
            for(int i=0; i<tickets.length; i++){
                if(tickets[i][0].equals(tmp) && !visited[i]){
                    route.add(tickets[i][1]);
                    visited[i] = true;
                    tmp = tickets[i][1];
                }
            }
        }
    }
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, new Comparator<String[]>() {
            public int compare(String[] arr1, String[] arr2) {
                if( ((Comparable)arr1[0]).compareTo(arr2[0]) > 0 ){
                    return 1;
                }
                else if(arr1[0].equals(arr2[0])){
                    if(((Comparable)arr1[1]).compareTo(arr2[1]) > 0 ){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
				else{
                    return -1;
                }
            }
        });
        visited = new boolean[tickets.length];
        route = new ArrayList<>();

        route.add("ICN");
        String start = "";
        for(int i=0; i<tickets.length; i++){
            if(tickets[i][0].equals("ICN")){
                route.add(tickets[i][1]);
                start = tickets[i][1];
                visited[i] = true;
                break;
            }
        }
        bfs(tickets, start);

        String[] answer = new String[tickets.length+1];
        for(int i=0; i<route.size(); i++){
            answer[i]=route.get(i);
        }
        return answer;
    }
}