import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] first =  new int[N];
        int[] sorting = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            first[i] = sorting[i] =  Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorting);
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : sorting){
            if(!map.containsKey(num)){
                map.put(num, count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : first){
            int rank =  map.get(key);
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}
