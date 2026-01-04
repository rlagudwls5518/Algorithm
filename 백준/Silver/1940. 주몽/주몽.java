import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 0;
        int count = Integer.parseInt(bufferedReader.readLine());
        int sum = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[count];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start] + arr[end] == sum){
                result++;
                start++;
                end--;
            }
            else if(arr[start] + arr[end] < sum){
                start++;
            }
            else if(arr[start] + arr[end] > sum){
                end--;
            }
        }

        System.out.println(result);

    }
}
