package dp;

import java.util.Scanner;

public class Main {

    static int [] dp;


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int N=scanner.nextInt();
         dp= new int[N+1];
         dp[1]=1;
         System.out.println(dfs(N)-1);

    }

    public static int dfs(int n){

        if(dp[n]>0) return dp[n];

        dp[n]=dfs(n-1)+1;
        if (n % 2 == 0) dp[n] = Math.min(dp[n], dfs(n / 2) + 1);
        if (n % 3 == 0) dp[n] = Math.min(dp[n], dfs(n / 3) + 1);

        return dp[n];
    }
}
