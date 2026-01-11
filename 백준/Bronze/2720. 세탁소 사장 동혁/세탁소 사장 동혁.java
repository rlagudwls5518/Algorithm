import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] arr = {25, 10, 5, 1};
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            for (int j = 0; j < arr.length; j++) {
                count = N / arr[j];
                sb.append(count).append(" ");
                N = N % arr[j];
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
