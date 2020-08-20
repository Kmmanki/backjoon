package StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 크로아티아알파벳 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            switch (chars[i]){
                case 'c':
                    if(i+1 < chars.length  )
                        if(chars[i+1] == '=' ||chars[i+1] == '-')
                          i++;
                        count++;
                        break;
                case 'd':
                    if(i+2 < chars.length  ) {
                        if (chars[i + 1] == '-')
                            i++;
                        else if (chars[i + 1] == 'z' && chars[i + 2] == '=')
                            i = i + 2;
                    }else if(i +1 < chars.length){
                        if (chars[i + 1] == '-')
                            i++;
                    }
                    count++;
                    break;
                case 'l':
                    if(i+1 < chars.length  )
                    if(chars[i+1] == 'j')
                        i++;
                    count++;
                    break;

                case 'n':
                    if(i+1 < chars.length  )
                    if(chars[i+1] == 'j')
                        i++;
                    count++;
                    break;

                case 's':
                    if(i+1 < chars.length  )
                    if(chars[i+1] == '=' )
                        i++;
                    count++;
                    break;

                case 'z':
                    if(i+1 < chars.length  )
                    if(chars[i+1] == '=' )
                        i++;
                    count++;

                    break;
                default:
                    count++;
            }
        }
        System.out.println(count);

    }
}
