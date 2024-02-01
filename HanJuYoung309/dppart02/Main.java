package dppart02;

import java.util.Scanner;

//1149
public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();

        int cost[]= new int [n+1]; //집을 칠하는 비용

        int result=0;
        for(int i=0; i<cost.length; i++){

            cost[i]=scanner.nextInt();

            if(cost[1]!=cost[2] && cost[n]!=cost[n-1] && cost[i-1]!=cost[i+1]){
               result= Math.min(cost[i],cost[n]);
            }

        }

        System.out.println(result);



    }
}
