import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            long div = N / A;
            long mod = N % A;
            if(mod<10){
              sb.append(mod);
            }
            else{
                sb.append((char) ((mod - 10) + 'A'));
            }
            N = div;
        }
        System.out.println(sb.reverse());
    }
}
