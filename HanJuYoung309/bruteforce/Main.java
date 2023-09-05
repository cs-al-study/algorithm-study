package bruteforce;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for(int i=0; i<8; i++){

            for(int j=i+1; j<9; j++){

                //합이 100명이 되는 유저를 찾아서
                if(sum-arr[i]-arr[j]==100){
                    arr[i]=0;
                    arr[j]=0;
                    //정렬해주고
                    Arrays.sort(arr);

                    //7명 오름차순으로 출력
                    for (int k=2; k<9; k++){
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }

    }
}
