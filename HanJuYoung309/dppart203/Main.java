package dppart203;

import java.util.Scanner;

//1309
public class Main {

    //가로2
    //세로n

    //dp배열을 이용하여 dp[i][j] 번째줄에서 j번째 칸에 동물을 놓을수 있는 경우의 수는 n

    //j=0 일때는 아무곳에도 동물을 안놓는 경우
    //j=1 일때ㅔ는 첫번째칸 j=2일때는 두번째칸

    //기저 사례: 쪼개지지 않는 가장 작은 작업
    //N=1일때는 기저사례로 가정 dp[1][0]=dp[1][1]=dp[1][2]=1로 설정


    static int N;
    static long dp[][];
    static int result=0;

    static final int MOD=9901;

    static long ans;

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        N=scanner.nextInt();

        dp=new long[N+1][3];

        dp[1][0]=dp[1][1]=dp[1][2]=1;

        for(int i=2; i<=N; i++){

            dp[i][0]=(dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%MOD;
            dp[i][1]=(dp[i-1][0]+dp[i-1][2])%MOD;
            dp[i][2]=(dp[i-1][0]+dp[i-1][1])%MOD;
        }

        ans= (dp[N][0]+dp[N][1]+dp[N][2])% MOD;

        System.out.println(ans);



    }
}
