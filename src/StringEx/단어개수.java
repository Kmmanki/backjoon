package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//단어의 개수 공백을 기준으로 +1 그리고 마지막이 아니라면
public class 단어개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr =str.trim().split(" ");

        if(arr.length == 1 && arr[0].equals("") ){
            System.out.println(0);
        }else {
            System.out.println(arr.length);
        }


    }
}
