package week5;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//0은 빈 칸, 1은 벽, 2는 바이러스가 있는 곳이다. 아무런 벽을 세우지 않는다면, 바이러스는 모든 빈 칸으로 퍼져나갈 수 있다.
public class BJ_14502 {

    static final int dx[] = {0,0,1,-1};  //상하좌우 방향 설정
    static final int dy[] = {1,-1,0,0};  //상화좌우
    static  int n;
    static  int m;

    static int arr[][];

    //static  int loacation[];

    static  boolean visited[];

    static  int max=Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        n= sc.nextInt();

        m= sc.nextInt();
        arr= new int[n][m];

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length; j++){

                arr[i][j]=sc.nextInt();
            }


        }
        dfs(0);

        System.out.println(max);


    }

    public static  void dfs(int wallCnt){

       if(wallCnt==3){
           bfs();
           return;
       }

       for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                 if(arr[i][j]==0){
                     arr[i][j]=1;
                     dfs(wallCnt+1);
                     arr[i][j]=0;
                 }
            }
       }

    }

    private static void bfs() {

        Queue<Node> q= new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==2){
                    q.add(new Node(i,j));
                }
            }
        }
        //원본 연구소를 바꾸지않기 위한 카피맵 사용
        int copyMap[][]= new int[n][m];

        for(int i=0; i<n; i++){
            copyMap[i]=arr[i].clone();
        }

        //bfs 탐색 시작
        while (!q.isEmpty()){

            Node now= q.poll();

            int x=now.x;
            int y=now.y;

            for(int k=0; k<4; k++){
                int nx=x+dx[k];
                int ny=y+dy[k];

                //연구소 범위 밖이 아니고 빈칸일 경우에만 바이러스를 퍼트린다
                if(0<=nx && nx<n && 0<=ny && ny<m){

                    if(copyMap[nx][ny]==0){
                        q.add(new Node(nx,ny));
                        copyMap[nx][ny]=2;
                    }
                }
            }
            //세이프존 확인
            funcSafeZone(copyMap);

        }

    }

    private static void funcSafeZone(int[][] copyMap) {

        int safeZone=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(copyMap[i][j]==0){
                    safeZone++;
                }
            }
        }
        if(max<safeZone){
            max=safeZone;
        }
    }

    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y=y;
        }
    }


}
