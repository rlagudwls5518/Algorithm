import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strs = new String[N];
        int count= 0;

        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        for (String str : strs) {
            boolean[] flag = new boolean[26];
            boolean isGroup = true;
            char[] chars = str.toCharArray();
            char prev = 0;
            for (int i = 0; i < chars.length; i++) {
                char curr =  chars[i];
                if ((prev != curr) && flag[chars[i] - 'a']) {
                    isGroup = false;
                    break;
                }
                flag[curr - 'a'] = true;
                prev = curr;
            }
            if (isGroup) {
                count++;
            }
        }

        System.out.println(count);

    }
}
