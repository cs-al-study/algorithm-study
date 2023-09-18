package bruteforce5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static int[] arr;
    public static boolean[] visited = new boolean[10];

    public static int N;
    public static int M;

    public static Stack<Integer> result= new Stack<>();

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

         N= scanner.nextInt();
         M=scanner.nextInt();


         dfs(0);
         scanner.close();

    }

    public static void dfs( int depth) {
        if (depth == M) {
            for (int x : result) {
                System.out.print(result + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && (result.isEmpty() ||i>result.peek())) {
                visited[i] = true;
                result.push(i);

                dfs(depth+1);
                visited[i]=false;
                result.pop();

            }
        }
    }
}
