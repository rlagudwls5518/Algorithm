
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];
        //a => 97  A => 65
        for (int i = 0; i < str.length(); i++) {
            if('A'<= str.charAt(i) && str.charAt(i) <= 'Z'){
                arr[str.charAt(i) - 'A']++;
            }
            else{
                arr[str.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch = '?';
        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 'A');
            }
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
