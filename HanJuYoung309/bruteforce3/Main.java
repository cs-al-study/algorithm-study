package bruteforce3;

import java.util.Scanner;

public class Main {

static     int answer=Integer.MAX_VALUE;

    static  int button[]={0,1,2,3,4,5,6,7,8,9};

    static int current=100;
    static int N=0;
    static int M=0;

    public static void check(){

        for(int i=0; i<button.length; i++){

            if(button[i]==0){
                return;
            }

        }


    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        N=scanner.nextInt();
        N=scanner.nextInt();

        for(int i=0; i<button.length; i++){

            button[i]=scanner.nextInt();

            if(button[i]==0){
                return;
            }



        }





    }
}
