import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputlist = new ArrayList<>();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            inputlist.add(n);
        }

        for (int input : inputlist) {
            StringBuilder sb = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            int sum =0;
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            sb.append(input);
            if (sum == input) {
                sb.append(" = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i != list.size() - 1) {
                        sb.append(list.get(i)).append(" + ");
                    }
                    else{
                        sb.append(list.get(i));
                    }
                }
            }
            else  {
                sb.append(" is NOT perfect.");
            }
            System.out.println(sb);
        }


    }
}
