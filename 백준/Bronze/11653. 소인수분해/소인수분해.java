import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int a = 2; a <= N; a++){
            while(N % a==0){
                sb.append(a).append("\n");
                N/=a;
            }
        }
        System.out.println(sb);
    }
}
