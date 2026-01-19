import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    static void DFS(int x, int y, int M, int N) {
        visited[x][y] = true;

        for(int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    DFS(nx, ny, M, N);
                }
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int count =0;
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new int[M][N];
            visited = new boolean[M][N];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            for (int a = 0; a < M; a++) {
                for (int b = 0; b < N; b++) {
                    if(map[a][b] == 1 && !visited[a][b]) {
                        count++;
                        DFS(a, b, M, N);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
