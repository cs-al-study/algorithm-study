package dp6;

import java.util.Scanner;

//15990
public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int result=0;

        int T= scanner.nextInt();

        for(int i=0; i<T; i++){

            int n=scanner.nextInt();

            solution(n);
        }

    }

    public static int solution(int n){

        int arr[]={1,2,3};
        int sum=0;

        for(int i=0; i<arr.length; i++){
            arr[i]+=sum;
        }

        return n;
    }
}
