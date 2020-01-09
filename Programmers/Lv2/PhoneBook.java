import java.util.Arrays;

class Solution4 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[j].length()>=phone_book[i].length() && phone_book[j].indexOf(phone_book[i])==0){
                    return false;
                }
            }
        }
        return true;
    }
}

public class PhoneBook{
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(s.solution(phone_book));
        // test case answer is false
    }
}