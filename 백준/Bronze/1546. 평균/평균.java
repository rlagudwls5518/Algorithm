import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String numbers = sc.nextLine();
        String [] numbersArr = numbers.split(" ");
        List<Double> newList = new ArrayList<>();

        int max = 0;

        for(String number :  numbersArr){
            if(max<Integer.parseInt(number)){
                max = Integer.parseInt(number);
            }
        }

        for(String number :  numbersArr){
            newList.add((Double.parseDouble(number)/max)*100);
        }

        double sum = 0;
        for (double num : newList) {
            sum += num;
        }

        System.out.println(sum/count);
    }
}