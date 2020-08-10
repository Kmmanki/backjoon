package StringEx;

import java.util.Scanner;

//문제: 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시

public class 알파벳찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result ;
        StringBuilder sb = new StringBuilder();
        char[] alpabat = new char[26];

        for (int i = 0; i <=25 ; i++){
            alpabat[i] = (char)(i+97);
        }

        for (int i = 0; i<=25 ; i++){
            sb.append(str.indexOf(alpabat[i])+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }
}
