package StringEx;

import java.util.Scanner;

//숫자와 문자열을 받아 각 문자가 숫자만큼 반복되는 문자열 만들기

public class 문자열반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < num ; i++){
            int r = sc.nextInt();
            String str = sc.next();

            for(int j = 0 ; j < str.length()*r ; j++){

                sb.append(str.charAt((j/r)));
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
