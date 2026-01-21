import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] map = new int[101];
    static boolean[] visited = new boolean[101];
    static int[] dice = {1, 2, 3, 4, 5, 6};
    static int[] count = new int[101];


    static void BFS(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        visited[num] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int i = 0; i < 6; i++) {
                int next = cur + dice[i];
                next = map[next];

                if(next == 100){
                    count[100] = count[cur] + 1;
                    return;
                }

                if (next < 100 && next > 0 && !visited[next]) {
                    q.add(next);
                    visited[next] = true;
                    count[next] = count[cur] + 1;
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 101; i++) {
            map[i] = i;
        }

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        BFS(1);
        System.out.println(count[100]);
    }
}
