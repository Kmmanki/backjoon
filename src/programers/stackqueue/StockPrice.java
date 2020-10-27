package programers.stackqueue;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {
    public static void main(String[] args) {
        int price[] = new int[]{1, 2, 3, 2, 3};
        int[] anwser = {};
        List<Integer> list = new ArrayList<>();


        for(int index =0 ; index < price.length; index++ ){
            int nowPrice = price[index];
            int tmp = price.length-1;

            for (int i = index ; i< price.length; i++){
                int p = price[i];
                if(nowPrice > p){
                    tmp = i - index;
//                    System.out.println(tmp);
                    break;
                }else{
                    tmp = price.length - (index+1);
                }
            }
            list.add(tmp);

        }


        anwser = list.stream().mapToInt(i ->i).toArray();

        System.out.println("");

    }
}
