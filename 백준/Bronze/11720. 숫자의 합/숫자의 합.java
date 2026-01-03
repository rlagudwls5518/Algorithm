import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int count = sc.nextInt();
        String nums = sc.next();

        String[] arr = nums.split("");
        
        for( String str : arr){
            result += Integer.parseInt(str);
        }
        System.out.println(result);
    }
}