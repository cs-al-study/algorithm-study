package week5;

import java.util.Scanner;

public class BJ_16928 {

    static  int n,m;

    static int dariInfo[] ; //사디리 정보의 X,Y

    static int snakeInfo[]; //뱀의 정보 u,v

    static  int arr[]; //주사위 1부터 6까지

    static  int min=Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();

        for(int i=0; i<dariInfo.length; i++){

            dariInfo[i]=sc.nextInt();
        }
        for(int j=0; j<snakeInfo.length; j++){

            snakeInfo[j]=sc.nextInt();
        }


    }
}
