

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<int[]> q = new LinkedList<>();
    static boolean[][][] visited;
    static int[][][] map;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static void BFS(int N, int M, int H) {
        while (!q.isEmpty()) {
            int[] c = q.poll();
            int x = c[2];
            int y = c[1];
            int z = c[0];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && nz >= 0 && nz < H) {
                    if (!visited[nz][ny][nx] && map[nz][ny][nx] == 0) {
                        q.add(new int[]{nz, ny, nx});
                        visited[nz][ny][nx] = true;
                        map[nz][ny][nx] = map[z][y][x] + 1;
                    }
                }
            }


        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());

                    if (map[i][j][k] == 1) {
                        q.add(new int[]{i, j, k});
                        visited[i][j][k] = true;
                    }
                }
            }

        }

        BFS(N, M, H);
        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, map[i][j][k]);
                }
            }
        }
        System.out.println(max - 1);

    }
}
