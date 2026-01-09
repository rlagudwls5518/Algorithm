import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int max = -1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    sb.delete(0, sb.length());
                    sb.append(i+1).append(" ").append(j+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(sb);
    }
}
