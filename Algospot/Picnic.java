package AlgospotPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Picnic {
    public static StringBuilder sb = new StringBuilder();
    public static Scanner sc = new Scanner(System.in);

    public static int C;
    public static int count;
    public static int N;
    public static int M;
    public static boolean[][] freindsMap;


    public static void main(String[] args)  throws Exception{

        //Test Case
        C=sc.nextInt();
        for(int i=0;i<C;i++) {
            solve();
        }
        System.out.println(sb.toString());
        sc.close();
    }

    public static void solve() throws Exception{

        // N, M 설정
        N = sc.nextInt();
        M = sc.nextInt();
        
        //초기화
        count =0;
        boolean[] checkList = new boolean[N];
        for (int i = 0; i < N; i++) {
            checkList[i] = false;
        }
        initMap();

        // input값을 이차원 배열에 삽입
        for (int i = 0; i < M; i ++) {
            freindsMap[sc.nextInt()][sc.nextInt()] = true;
        }

        //해당 함수 호출
        picnic(checkList);
        
        //sb 에 결과 저장
        sb.append(count).append("\n");

        //System.out.println(sb.toString());
    }
    
    /*
    public static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(freindsMap[i][j] + " ");

            }
            System.out.println();
        }
    }
	*/
    
    public static void picnic(boolean[] checkList) {
        //다음 n, 즉 false를 찾는다.
        int n=0;
        while (n<N&&checkList[n]){
            n++;
        }
        //모두 true일 때 : 기저, return
        if(n==N) {
            count++;
            return;
        }

        //n에 해당하는 친구 리스트 설정
        boolean[] isfriend = freindsMap[n];
        // 친구인지 검사
        for(int i=0;i<N;i++){
            // 친구이면서, 짝이 없는 아이
            if(isfriend[i] && !checkList[i]){
                boolean[] tempck = checkList.clone();

                tempck[i] = true;
                tempck[n] = true;
       
                checkList[i] = checkList[n] = true;
                picnic(checkList);
                checkList[i] = checkList[n] = false;
            }
        }

    }

    public static void initMap() {
        freindsMap = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                freindsMap[i][j] = false;

            }
        }
    }


}