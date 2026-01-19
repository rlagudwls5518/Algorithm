import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] check = new int[100001];
    static int N;
    static int M;

    static void BFS(int num){
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        check[num] = 1;

        while (!q.isEmpty()){
            int x = q.poll();
            for(int i =0; i<3; i++){
                int next;

                if(i == 0){
                    next = x+1;
                }
                else if(i == 1){
                    next = x-1;
                }
                else{
                    next = x*2;
                }
                if(x == M){
                    System.out.println(check[x]-1);
                    return;
                }
                if(next >= 0 && next < check.length && check[next] == 0){
                    q.add(next);
                    check[next] = check[x] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if(N==M){
            System.out.println(0);
        }
        else{
            BFS(N);
        }
    }
}
