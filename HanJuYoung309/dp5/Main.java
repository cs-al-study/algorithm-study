package dp5;

import java.util.Scanner;

public class Main {

  static  int dp[];
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();

        dp= new int[n+1];
        dp[1]=2;

        dp[2]=4;

        for(int i=3; i<=n; i++){

           dp[i]= dp[i-1]+2*dp[i-2];

        }


        System.out.println(dp[n]%10007);










    }
}
