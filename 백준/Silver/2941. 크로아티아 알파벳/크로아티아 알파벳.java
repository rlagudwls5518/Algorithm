

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        String[] arr = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < arr.length; i++) {
            if(str.contains(arr[i])){
                str = str.replace(arr[i], "*");
            }
        }

        System.out.println(str.length());
    }
}
