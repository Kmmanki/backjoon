package programers.hash;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {
        String[] phoneBook = new String[]{"119", "97674223", "1195524421"};

        Set<String> set = new HashSet<>();

        for(String str : phoneBook){
            set.add(str);
        }

        for(String str : set){
            for(int i = 0; i < str.length() ; i++){
                if(set.contains(str.substring(0,i))){

                }
            }
        }

    }
}
