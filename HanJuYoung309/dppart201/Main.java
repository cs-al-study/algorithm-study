package dppart201;

//import java.util.Scanner;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//
//
//        Scanner scanner= new Scanner(System.in);
//
//        //삼각형의 크기
//        int n= scanner.nextInt();
//
//        //정수값을 담을 배열
//        int arr[]= new int [n+1];
//        for(int i=1; i<=n; i++){
//
//            arr[i]=scanner.nextInt();
//
//            dfs(n);
//
//        }
//
//    }
//    public static void dfs(int n){
//
//        boolean isCheck=false;
//        int sum=0;
//        for(int i=1; i<=n; i++){
//
//            for(int j=1; j<=n; j++){
//                if(i>j){
//                    isCheck=true;
//                    i+=sum;
//                }
//            }
//        }
//
//    }
//
//}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //삼각형의 크기
        int n = Integer.parseInt(br.readLine());

        int d[][] = new int[n+1][n+1];
        int a[][] = new int[n+1][n+1];

        //배열초기화
        for(int i=1; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=i; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                d[i][j] = Math.max(d[i-1][j-1], d[i-1][j]) + a[i][j];
            }
        }
        int ans=0;
        //마지막층 각각에 최댓값을 가지고 있어서 가장 큰 값 찾아준다.
        for(int i=1; i<=n; i++) {
            if(ans < d[n][i]) ans = d[n][i];
        }

        System.out.println(ans);
    }
}