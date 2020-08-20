package Math;

/*
* 1|1
* 2 | 2 ~ 7     | 6 * 1 범위
* 3 | 8 ~ 19    | 6 * 2 범위
* 4 | 20 ~ 38   | 6 * 3 범위
* 5 | 38 ~ 61   | 6 * 4 범위
* 입력값  <= 범위의 큰수 count가 정답
* */
import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s= sc.nextInt();
        int count = 1;
        int num1 = 7;

        if(s == 1){
            System.out.println(count);
            return;
        }

        while (true){
            count++;
            if(s <= num1){
                System.out.println(count);
                break;
            }
            num1 =num1 + (6 * count);
        }

    }
}
