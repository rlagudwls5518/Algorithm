/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    
    static class City {
        int x, y, s;

        public City(int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }

    static int[] parent;

    // Find function with path compression
    static int find(int i) {
        if (parent[i] < 0 || parent[i] == i) {
            return i;
        }
        // Path compression
        return parent[i] = find(parent[i]);
    }
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= TC; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            City[] cities = new City[N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                cities[i] = new City(x, y, s);
            }

            parent = new int[N];

            // Step 1: Determine initial threats and dependencies
            for (int i = 0; i < N; i++) {
                double maxInfluence = -1.0;
                int bestThreat = -1;
                boolean isTie = false;

                for (int j = 0; j < N; j++) {
                    if (i == j) continue;

                    long dx = (long)cities[j].x - cities[i].x;
                    long dy = (long)cities[j].y - cities[i].y;
                    double distSq = dx * dx + dy * dy;

                    if (distSq == 0) continue;

                    double influence = cities[j].s / distSq;

                    if (influence > cities[i].s) {
                        if (influence > maxInfluence) {
                            maxInfluence = influence;
                            bestThreat = j;
                            isTie = false;
                        } else if (influence == maxInfluence) {
                            isTie = true;
                        }
                    }
                }

                if (bestThreat == -1) { // No threats -> Monarchy
                    parent[i] = i;
                } else if (isTie) { // Tie for max influence -> Republic
                    parent[i] = -2; // Special value for Republic
                } else { // Follows the best threat
                    parent[i] = bestThreat;
                }
            }

            // Step 2: Resolve dependency chains by calling find for all nodes
            for (int i = 0; i < N; i++) {
                find(i);
            }

            // Step 3: Generate output
            sb.append("#").append(t).append(" ");
            for (int i = 0; i < N; i++) {
                int root = parent[i];
                if (root == -2) {
                    sb.append("D ");
                } else if (root == i) {
                    sb.append("K ");
                } else {
                    sb.append(root + 1).append(" ");
                }
            }
            sb.setLength(sb.length() - 1); // Remove trailing space
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}