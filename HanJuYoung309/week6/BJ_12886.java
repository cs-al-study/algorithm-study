package week6;

import java.util.Scanner;

public class BJ_12886 {

    static  int X=Integer.MAX_VALUE;

    static  int Y= Integer.MIN_VALUE;

    static int a;
    static int b;
    static int c;
    static int ans;

    static  boolean visited [][]= new boolean[1501][1501];

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        a= sc.nextInt();

       b=sc.nextInt();

       c= sc.nextInt();

       if((a+b+c)%3!=0){
           System.out.println(0);
       }else{
           dfs(a,b,c);
       }




    }

    public static void dfs(int a,int b, int c){
//        if(a>b && a>c && b>c ){
//            Y=a;
//            X=c;
//        }else if(b>a && b>c && a>c){
//            Y=b;
//            X=c;
//        }else if(c>a && c>b && b>a){
//            Y=c;
//            X=a;
//        }

        if(a==b && b==c){
            ans=1;
            return;
        }

        calc(a,b,c);
        calc(b,c,a);
        calc(a,c,b);

    }

    static  void calc(int a,int b, int origin){
        int small= Math.min(a,b);

        int big= Math.max(a,b);

        if(!visited[small*2][big-small]){
            visited[small*2][big-small]=visited[big-small][small*2]=true;
            dfs(small*2,big-small,origin);
        }

    }
}
