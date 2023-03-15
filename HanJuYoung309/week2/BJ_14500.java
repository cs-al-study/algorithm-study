import java.util.Map;
import java.util.Scanner;

public class BJ_14500 {

    static  int n; //가로
    static  int m; //세로

    static  int arr[][];
    static boolean [][]visit;
    static int sum=0;
    static  int max=Integer.MAX_VALUE;

    //상하좌우
    static  int []dx={-1,1,0,0};
    static  int[] dy={0,0,-1,-1};



    public static void main(String[] args) {

        Scanner  sc= new Scanner(System.in);

        n=sc.nextInt();
        m= sc.nextInt();

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

               arr[i][j]=sc.nextInt();


            }
        }

        //전체 탐색
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                visit[i][j]=true;
                check(i,j,arr[i][j],1);
                visit[i][j]=false;
            }
        }

    }

    static  void check (int row, int col, int sum, int count){

         if(count==4){
             max= Math.max(max,sum);
             return;
         }

         //상하좌우
        for(int i=0; i<4; i++){

            int curRow=row+dx[i];
            int curCol=col+dy[i];

            //범위를 벗어나면 예외처리
            if(curRow<0 || curRow>=n || curCol<0 || curCol>=m){
                continue;
            }

            //아직 방문하지 않은 곳..
            if(!visit[curRow][curCol]){

                if(count==2){
                    visit[curRow][curCol]=true;
                    check(row,col,sum+arr[curRow][curCol],count+1);
                    visit[curRow][curCol]=false;
                }
                visit[curRow][curCol]=true;
                check(curRow,curCol,sum+arr[curRow][curCol],count+1);
                visit[curRow][curCol]=false;
            }
        }

    }


}
