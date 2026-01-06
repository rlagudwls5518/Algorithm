import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        int[] arr = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = Integer.parseInt(numbers.substring(i, i + 1));
        }

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            int dump = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = dump;
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(Integer.toString(arr[i]));
        }

        System.out.println(result);
    }
}
