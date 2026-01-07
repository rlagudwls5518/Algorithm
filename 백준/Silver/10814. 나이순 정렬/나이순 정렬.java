import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr,(e1, e2) -> {
            if (e1[0].equals(e2[0])) {// 나이가 같으면 먼저 들어온 순
                return 0;
            } else { // 나이가 작은 순대로
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
