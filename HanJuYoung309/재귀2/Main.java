package 재귀2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int L;
    static int C;

    static String arr[]=new String[C];

    static ArrayList<String > result= new ArrayList<>();


    public static void main(String[] args) {


         Scanner scanner= new Scanner(System.in);

         L=scanner.nextInt();
         C=scanner.nextInt();

        //C만큼 반복
        for (int i=1; i<arr.length; i++){

            arr[i]=scanner.nextLine();

            //Arrays.sort(arr);


        }


    }

    public static void dfs(int L,int C){

        for(int i=0; i<C; i++){


        }

    }
}
