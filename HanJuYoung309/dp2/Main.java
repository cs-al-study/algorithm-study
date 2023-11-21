package dp2;

import java.util.Scanner;

//카드 구매하기 2

//일반화 시키면 D[i] = P[n] + D[i-n] 이다.
//n은 1, 2, 3 ... n이고, P[n]은 가격이다.

public class Main {



    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();

        int [] arr=new int[n+1];
        int [] d= new int[n+1];

        for(int i=1; i<=n; i++ ){
            arr[i]= scanner.nextInt();
            d[i]= Integer.MAX_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.min(d[i], d[i - j] + arr[j]);
            }
        }

        System.out.println(d[n]);

        scanner.close();

    }

}
