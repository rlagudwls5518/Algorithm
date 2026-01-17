import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        long x = -999;
        
        while (x <= 999) {
            long y = -999;
            while (y <= 999) {
                if (((a * x) + (b * y) == c) && ((d * x) + (e * y) == f)) {
                    sb.append(x).append(" ").append(y);
                    break;
                }
                y++;
            }
            x++;
        }
        System.out.println(sb);
    }
}
