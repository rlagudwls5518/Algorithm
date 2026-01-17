import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int a = 1; a < N; a++) {
            int temp = a;
            int sum = a;
            while (temp > 0) {
                int f = temp % 10;
                temp /= 10;
                sum += f;
            }
            if (sum == N) {
                result =a;
                break;
            }
        }
        System.out.println(result);
    }
}
