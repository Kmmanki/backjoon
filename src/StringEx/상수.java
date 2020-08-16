package StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 상수 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num1 = reverse( Integer.parseInt(str[0]));
        int num2 = reverse( Integer.parseInt(str[1]));

        System.out.println(Integer.max(num1,num2));



    }
    public static int  reverse(int num){
        int tmp1 = num/100;
        int tmp2 = ((num%100)/10)*10;
        int tmp3 = (num%10)*100;


        return tmp3+tmp2+ tmp1;
    }

}
