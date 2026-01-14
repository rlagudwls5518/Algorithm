import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long V = Integer.parseInt(st.nextToken());
        long result = 0;

        long mod = (V-B)%(A-B);
        if(mod == 0){
            result = (V-B)/(A-B);
        }
        else{
            result = (V-B)/(A-B)+1;
        }
        System.out.println(result);
    }
}
