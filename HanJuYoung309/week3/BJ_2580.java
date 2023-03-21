package week3;

import java.util.Scanner;

public class BJ_2580 {

    static  int sdocu[][];


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //입력
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                sdocu[i][j]= sc.nextInt();

                if(sdocu[i][j]==0){
                    return;
                }
            }
        }

        for(int i=0; i<9; i++){

            for(int j=0; j<9; j++){

                solve(9,9);
            }
        }


    }

    static void solve(int row, int col){
          //행과 열에 1부터9까지 숫자가 하니씩만 들어가야함



    }
}
