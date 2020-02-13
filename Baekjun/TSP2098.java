/*2098번 문제
 입력 예제
 4
 0 10 15 20
 5  0  9 10
 6 13  0 12
 8  8  9  0
 정답
 35
*/
import java.util.Scanner;

public class TSP {
	static int dist[][];
	static boolean country[];
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		dist = new int[N][N];
		country = new boolean[N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				dist[i][j] = scan.nextInt();
			}
		}
		scan.close();
	}
}
