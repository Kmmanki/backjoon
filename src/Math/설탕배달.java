package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 설탕배달 {
    public static void main(String[] args) throws Exception {
        int num1 = 5;
        int num2 = 3;
        int result = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        int n = Integer.parseInt(args);



        for (int i = 0; num1 * i <= n  ; i++){
            for (int j  = 0; num2 * j <= n; j++){
                if(i * num1 + j * num2 == n )
                    result  =  i + j ;
            }
        }
        System.out.println(result);
    }
}
