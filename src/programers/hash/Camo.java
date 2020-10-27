package programers.hash;

import java.util.HashMap;
import java.util.Map;

public class Camo {
    public static void main(String[] args) {
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> clothesMap = new HashMap<>();

        for(String[] str : clothes){
            if (clothesMap.containsKey(str[1]))
                clothesMap.put(str[1],clothesMap.get(str[1]) +1);
            else
                clothesMap.put(str[1],1);
        }

        int total = 1;
        for(Integer i : clothesMap.values()){
            total *= i+1;
        }

        System.out.println(total-1);
    }
}
