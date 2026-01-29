import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] gears = new ArrayList[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 4; i++) {
            gears[i] = new ArrayList<>();
        }
        for(int i = 0; i < 4; i++){
            String[] str =  br.readLine().split("");
            for(String s : str){
                gears[i].add(Integer.parseInt(s));
            }
        }

        int tr = Integer.parseInt(br.readLine());

        for (int i = 0; i < tr; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            rotation(n,m);
        }

        int count = 0;
        for(int i = 0; i < 4; i++){
            if(gears[i].get(0) == 1){
                if(i == 0){
                    count+=1;
                }
                if(i == 1){
                    count+=2;
                }
                if(i == 2){
                    count+=4;
                }
                if(i == 3){
                    count+=8;
                }
            }
        }

        System.out.println(count);

    }
    // 1 시계 -1 반시계
    static void rotation(int startGear, int startDir){
        int[] dirs = new int[4]; // 모든 톱니의 방향을 0으로 초기화
        dirs[startGear-1] = startDir; // 시작 톱니 방향 설정

    // 1. 오른쪽으로 전염시키기
        for (int i = startGear-1; i < 3; i++) {
            if (gears[i].get(2) != gears[i + 1].get(6)) {
                dirs[i + 1] = -dirs[i]; // 다르면 반대방향
            } else {
                break; // 같으면 더 이상 안 돌아감
            }
        }

    // 2. 왼쪽으로 전염시키기
        for (int i = startGear-1; i > 0; i--) {
            if (gears[i].get(6) != gears[i - 1].get(2)) {
                dirs[i - 1] = -dirs[i]; // 다르면 반대방향
            } else {
                break; // 같으면 더 이상 안 돌아감
            }
        }
        rotate(dirs);
    }
    static void rotate(int[] dirs){
        for(int i = 0; i < dirs.length; i++){
            if(dirs[i] == 1){//시계
                int dump = gears[i].remove(7);
                gears[i].add(0, dump);
            }
            else if(dirs[i] == -1){
                int dump = gears[i].remove(0);
                gears[i].add(dump);
            }
        }
    }
}
