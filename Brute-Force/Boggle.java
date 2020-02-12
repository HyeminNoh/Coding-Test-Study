import java.io.*;

public class Boggle{
    static char[][] map = new char[5][5];
    static final int[] dx = {-1, -1, -1, 1, 1, 1, 0, 0};
    static final int[] dy = {-1, 0, 1, -1, 0, 1, -1, 1};

    static boolean hasWord(int y, int x, String word){
        if(!(y>=0 && y<5 && x>=0 && x<5)){
            return false;
        }
        if(map[y][x] != word.charAt(0)){
            return false;
        }
        if(word.length()==1){
            return true;
        }
        for(int direction = 0; direction<0; direction++){
            int nextY = y+dy[direction];
            int nextX = x+dx[direction];
            if(hasWord(nextY, nextX, word.substring(1))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[]args){
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        BufferReader bw = new BufferWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        while(testCase-->0){
            for(int i=0; i<5; i++){
                String str = br.readLine();
                map[i] = str.toCharArray();
            }
            int wordsCount = Integer.parseInt(br.readLine());
            while(wordsCount-- > 0){
                String word = br.readLine();
                String result = "NO";
                for(int j=0; j<5; j++){
                    for(int k=0; k<5; k++){
                        if(hasWord(y,x,word) && result.equals("NO"))
                            result = "YES";
                    }
                }
                bw.write(word+" "+result);
                bw.newLine();
                bw.flush();
            }
            bw.close();
        }
    }
}

/* 문제 예시 입력, 출력
input:
1
URLPM
XPRET
GIAET
XTNZY
XOQRS
6
PRETTY
GIRL
REPEAT
KARA
PANDORA
GIAZAPX

output:
PRETTY YES
GIRL YES
REPEAT YES
KARA NO
PANDORA NO
GIAZAPX YES
 */