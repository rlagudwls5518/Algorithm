import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        int[] count = {1, 1, 2, 2, 2, 8};

        for (int j = 0; j < 6; j++) {
            int a = Integer.parseInt(st.nextToken());
            sb.append(count[j] - a).append(" ");
        }
        System.out.println(sb);

    }
}
