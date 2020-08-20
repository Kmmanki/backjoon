package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 손익분기점 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]) ;
        int b =  Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]) ;

        if (b >= c ){
            System.out.println(-1);
            return;
        }

        int amount = a/ (c-b);
        if(a < (c-b)* amount){
            System.out.println(amount);
        }else{
            System.out.println(amount+1);
        }




    }

    }
