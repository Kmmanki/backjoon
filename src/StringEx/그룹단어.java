package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 그룹단어 {
    public static void 그룹단어(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i = 0 ; i < num ; i++){
            char[] chars = sc.next().toCharArray();
            Map<Character, Integer> map = new HashMap<>();

            if(chars.length != 1){
                for(int j = 0 ;j < chars.length ; j++){
                    if(!map.containsKey(chars[j])){
                        map.put(chars[j], 1);
                    }else{
                        if(chars[j-1] == chars[j] && map.get(chars[j]) != -1 )
                            map.put(chars[j], map.get(chars[j])+1);
                        else
                            map.put(chars[j], -1);
                    }

                }
            }else if(chars.length == 1){
                count++;
            }



            if(!map.toString().contains("-1") &&chars.length != 1)
                count++;
        }
        System.out.println(count);
    }

}
