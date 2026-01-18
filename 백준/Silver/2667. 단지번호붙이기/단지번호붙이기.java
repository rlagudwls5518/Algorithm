import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int count;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayList<Integer> resultList = new ArrayList<>();

    static void dfsBasic(int x, int y, int N) {
        visited[x][y] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                // 2. 집이 있고 아직 방문하지 않았다면
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfsBasic(nx, ny, N); // 다음 집으로 이동!
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine(); // 한 줄을 먼저 읽고
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0'; // 그 줄의 글자들을 숫자로 변환
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // "여기가 집이고, 아직 방문 안 한 단지의 시작인가?"
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfsBasic(i, j, N);
                    resultList.add(count);
                }
            }
        }
        Collections.sort(resultList);
        sb.append(resultList.size()).append("\n");
        for(int i=0;i<resultList.size();i++){
            sb.append(resultList.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
