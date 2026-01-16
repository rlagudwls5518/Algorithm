import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;

        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x > max_x){
                max_x = x;
            }
            if(y > max_y){
                max_y = y;
            }
            if(x < min_x){
                min_x = x;
            }
            if(y < min_y){
                min_y = y;
            }
        }
        if(N==1){
            System.out.println(0);
        }
        else{
            System.out.println((max_x - min_x) * (max_y - min_y));
        }


    }
}
