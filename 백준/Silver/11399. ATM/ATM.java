import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int dump = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = dump;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i+1; j++) {
                sum += arr[j];
            }
        }

        System.out.println(sum);
    }
}
