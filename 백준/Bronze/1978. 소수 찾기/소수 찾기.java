import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        int count = 0;
        st =  new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int num : arr){
            boolean flag = true;
            if(num<2){
                continue;
            }
            for(int i = 2; i < num; i++) {

                if(num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }

        System.out.println(count);



    }
}
