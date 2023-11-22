package dp3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();

        int [] arr=new int[n+1];
        int [] d= new int[n+1];

        for(int i=1; i<=n; i++ ){
            arr[i]= scanner.nextInt();
            d[i]= Integer.MIN_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], d[i - j] + arr[j]);
            }
        }

        System.out.println(d[n]);

        scanner.close();


    }
}
