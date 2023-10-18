package 순열;

import java.io.*;

public class Main {
    public static int N; //입력값
    public static int arr[];
    public static boolean visited[]; //방문여부=> 중복이 불가능하기때문에
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];

        Func(0);
        System.out.println(sb.toString());
    }

    public static void Func(int depth) {
        if(depth == N) {
            for(int i=0; i<N; i++)
                sb.append(arr[i] + " ");

            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++) {
            if(visited[i])
                continue;

            arr[depth] = i + 1;
            visited[i] = true;
            Func(depth + 1);
            visited[i] = false;
        }
    }
}