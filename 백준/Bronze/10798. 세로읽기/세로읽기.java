import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[5];
        int maxIndex =0;
        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
            maxIndex = Math.max(maxIndex, arr[i].length());
        }

        for(int j = 0; j < maxIndex; j++){
            for(int i = 0; i < 5; i++){
                if(j < arr[i].length()){
                    sb.append(arr[i].charAt(j));
                }

            }
        }

        System.out.println(sb);
    }
}
