package bruteforce2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int E= scanner.nextInt();

        int S= scanner.nextInt();

        int M=scanner.nextInt();

        int max= Integer.MIN_VALUE;


        if( E==1 && S==1 && M==1){

          max=1;
        }
        else if(E>16 && S>29 && M>20 ) {
            max++;
        }


        //System.out.println(max);



    }
}
