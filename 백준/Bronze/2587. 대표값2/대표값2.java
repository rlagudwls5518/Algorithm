import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        Collections.sort(arr);
        System.out.println(sum / arr.size());
        System.out.println(arr.get((arr.size() - 1) / 2));
    }
}
