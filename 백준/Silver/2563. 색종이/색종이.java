import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int size = 0;
        int N = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[101][101];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            for (int j = k; j < k + 10; j++) {
                for (int l = a; l < a + 10; l++) {
                    if (!arr[j][l]) {
                        arr[j][l] = true;
                        size++;
                    }
                }
            }
        }
        System.out.println(size);
    }
}
