package backJoon;

import java.util.Scanner;

public class BJ_14225 {

    public static void main(String[] args) {


        //부분 수열의 합

        //수열 S가 주어졋을때 수열 S의 부분 수열의 합으로 나올수 없는 가장 작은 자연수를 구하시오

        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        int sum=0;

        int min=Integer.MIN_VALUE;

        //수열 s
        int arr[]= new int[3];

        for(int i=0; i<n; i++){

            arr[i]=sc.nextInt();

            int temp=arr[0];

            if(temp<arr[i]){
               sum+=arr[i];

               if(sum<min){
                   min=sum;
               }
            }


        }
        System.out.println(sum);


    }
}
