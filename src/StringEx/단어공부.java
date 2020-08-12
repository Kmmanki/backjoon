package StringEx;


//문자열을 입력받고 가장 많이 사용된 알파벳을 찾는다. 가장 많은 알파멧이 같으경우 ?를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//맵을 만들어 카운트를 올린다. 그중 가장 높은 것을 출력
public class 단어공부  {
    public final static int A = 65;
    public final static int MAX_STR = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        br.close();

        char[] chars = word.toUpperCase().toCharArray();
        int[] arr = new int[26];
        int max = -1;
        char result = '?';
        int count = 0;

        for(int i = 0 ; i < chars.length ; i++){
            int index = ((int)chars[i])-A;
            arr[index] = arr[index] +1;
            max = arr[index] > max ? arr[index] : max;
        }

        for(int i = 0 ; i < arr.length ; i++){
           if(max == arr[i]){
               count++;
               result = count >=2 ? '?' : (char)(i+A);
           }
        }

        System.out.println(result);

    }
}
