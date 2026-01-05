import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        StringBuffer bf = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;

        for(int i = 0; i < n; i++){

            int su = arr[i];
            if(su >= num){ // 값이 같아질때까지 푸시
                while(su >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else{//값이 넘으면 팝
                int a = stack.pop();
                if(a > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    bf.append("-\n");
                }
            }
        }
        if(result){
            System.out.println(bf.toString());
        }
    }
}
