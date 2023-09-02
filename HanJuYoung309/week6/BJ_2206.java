package week6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2206 {

    static int arr[]={-1,-1,0,1};

    static int n;
    static int m;

    static int map[][]=null;


    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

         n=sc.nextInt();
         m=sc.nextInt();

         for(int i=0; i<n; i++){

             for(int j=i; j<m; j++){


             }
         }

    }

    public static void bfs(){

        //현재 노드
        int curNode=0;

        HashSet<Integer> visitedSet= new HashSet<>();

        Queue<Integer> queue= new LinkedList<>();

        queue.add(curNode);

        while(!queue.isEmpty()){
            curNode=(int)queue.poll();

            if(visitedSet.contains(curNode)){
                continue;
            }

            visitedSet.add(curNode);

            System.out.println(curNode);


        }

    }
}
