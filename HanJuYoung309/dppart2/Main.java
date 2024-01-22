package dppart2;

import java.util.Scanner;

public class Main {


    static int dp[];
    static int arr[];

    public static void lisDp(int n){
        for (int i = 0; i < n; i++) {
            dp= new int[n+1];
            dp[i] = 1;            //해당 원소에서 끝나는 LIS 길이의 최솟값. 즉, 자기 자신
            for (int j = 0; j < i; j++) {
                //i번째 이전의 모든 원소에 대해, 그 원소에서 끝나는 LIS의 길이를 확인한다
                arr= new int[n+1];
                if (arr[i] > arr[j]) {
                    //단, 이는 현재 수가 그 원소보다 클 때만 확인한다.
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    //dp[j] + 1 : 이전 원소에서 끝나는 LIS에 현재 수를 붙인 새 LIS 길이
                    System.out.println(dp[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();


          lisDp(n);

    }


}
