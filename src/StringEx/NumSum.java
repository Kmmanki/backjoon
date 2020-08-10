package StringEx;

import java.util.Scanner;
//n을 입력받고 각 자리를 더하기


public class NumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String size = sc.next();
        String numStr = sc.next();

        long total = 0;
        for (int i = 0; i < numStr.length() ; i++){
            String a =String.valueOf(numStr.charAt(i)) ;
            total +=Long.parseLong(a);
        }
        System.out.println(total);
    }
}
