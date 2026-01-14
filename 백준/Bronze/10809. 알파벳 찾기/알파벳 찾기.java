import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arrChar = str.toCharArray();

        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }

        for (int i = 0; i < arrChar.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if ((alpha[j] == -1) && (arrChar[i] == j + 97)) {
                    alpha[j] = i;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}
