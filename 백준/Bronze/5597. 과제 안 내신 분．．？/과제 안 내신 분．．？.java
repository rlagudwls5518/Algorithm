import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];

        for(int i = 0; i < 28; i++){
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 1; j <= 30; j++){
            if(!arr[j]){
                sb.append(j).append("\n");
            }
        }

        System.out.println(sb);

    }
}
