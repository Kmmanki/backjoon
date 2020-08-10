package StringEx;
//문제 :입력받은 1개의 문자를 아스키로 표현

//char를 int로 변환하면 아스키값나옴

import java.util.Scanner;

public class Asci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.next().charAt(0);
        System.out.println(c);

    }
}
