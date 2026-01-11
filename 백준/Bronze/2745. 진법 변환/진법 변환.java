import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        long B = Integer.parseInt(st.nextToken());
        long sum = 0;
        int count = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            int a;
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                a = N.charAt(i) - 'A' + 10;
            } else {
                a = N.charAt(i) - '0';
            }
            sum += (long)(a * Math.pow(B, count));
            count++;

        }
        System.out.println(sum);
    }
}
