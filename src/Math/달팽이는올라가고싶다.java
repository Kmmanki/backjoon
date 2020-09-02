package Math;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) throws  Exception {
        int A, B, V = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        A = Integer.parseInt(str[0]);
        B = Integer.parseInt(str[1]);
        V = Integer.parseInt(str[2]);

        if((((V-A) / (A-B)) * (A-B)) + A >= V ){
            System.out.println(((V-A) / (A-B) )+ 1);
        }else{
            System.out.println(((V-A) / (A-B) )+ 2);
        }

    }


}
// 높이 v 올라가는 높이 a 밤에 내려가는 높이 b  A = 2 B = 1 V = 5
// v-a / a-b 하면 도착 전날 일 수 를 구할 수 있다 3 / 1  = 3
//전날 높이를 구해보자  A-B* N  1 * 3
// 전날 높이 + A >= 면 N+ 1 넘지 못하면 N+2;