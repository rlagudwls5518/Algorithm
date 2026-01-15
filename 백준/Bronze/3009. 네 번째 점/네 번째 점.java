import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] point1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] point2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] point3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] point4 = new int[2];

        for (int i = 0; i < 2; i++) {
            if (point1[i] == point2[i]) {
                point4[i] = point3[i];
            } else if (point1[i] == point3[i]) {
                point4[i] = point2[i];
            } else {
                point4[i] = point1[i];
            }
        }
        System.out.println(point4[0] + " " + point4[1]);


    }
}
