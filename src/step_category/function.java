package step_category;

import java.util.Scanner;
//
//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
//        등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, 1<= ? <= N
//        N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

//1~9 = 한수
//10 ~ 99  10은  1 0 1 둘차이는 1 / 27은 2와 7 5차이남 즉 모든 수가 한수
//n이  100 보다 작으면 한수의 갯수는 n
//100 보다 크면 각 자리수 찾아서 백의 자리 - 십의 자리 == 십의 자리 -일의 자리 라면 한수
//Ex 753 7 - 5  == 5 - 3 한수
public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[3];

        int count = 0;

        for (int i = 1; i <= num; i++){

            if(1 <= i && i <= 99){
                count++;
            }else if(100<= i && i <= 999){
                arr[0] = i/100;
                arr[1] = (i%100) /10;
                arr[2] = (i%100) %10;
                if(arr[0] - arr[1] == arr[1]-arr[2])
                    count++;
            }

        }

        System.out.println(count);
    }


}
