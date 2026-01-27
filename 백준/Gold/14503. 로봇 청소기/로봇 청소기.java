import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] cleaned;
    static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    static int[] dy = {0, 1, 0, -1};
    static int cleandCount = 0;

    static void DFS(int x, int y, int dir) {

        while (true) {
            boolean found = false;
            if (map[x][y] == 0 && !cleaned[x][y]) {
                cleaned[x][y] = true;
                cleandCount++;
            }

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (map[nx][ny] == 0 && !cleaned[nx][ny]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                dir = (dir + 3) % 4;
                int fx = x + dx[dir];
                int fy = y + dy[dir];
                if (!cleaned[fx][fy] && map[fx][fy] == 0) {
                    x = fx;
                    y = fy;
                }
            } else {
                int bx = x - dx[dir];
                int by = y - dy[dir];
                if (map[bx][by] == 1) {
                    return;
                }
                x = bx;
                y = by;
            }

        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        cleaned = new boolean[N][M];

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(x, y, dir);
        System.out.println(cleandCount);

    }
}
