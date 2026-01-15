import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = isPrime(M, N);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        if(list.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }

    }
    static List<Integer> isPrime(int N, int M) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = N; i <= M; i++) {
            if (i < 2) continue;
            boolean prime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
