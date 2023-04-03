package week5;

import java.util.*;

public class BJ_16948 {
    static int[] dr = {-2, -2, 0, 0, 2, 2}; //열좌표
    static int[] dc = {-1, 1, -2, 2, -1, 1}; //행좌표

    static int shortestPath(int n, int r1, int c1, int r2, int c2) {
        boolean[][] visited = new boolean[n][n]; //방문여부 배얄
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r1, c1, 0});
        visited[r1][c1] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1], d = curr[2];
            if (r == r2 && c == c2) {
                return d;
            }
            //6방면으로 탐색
            for (int i = 0; i < 6; i++) {
                int nr = r + dr[i], nc = c + dc[i];
                //체스판을 넘어가거나 방문을 한 경우
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    //도착못햤을 경우 방문 체크하고 다시 큐에 넣기
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, d+1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //체스판의 크기
        int r1 = sc.nextInt(), c1 = sc.nextInt(); //데스나이트 위치
        int r2 = sc.nextInt(), c2 = sc.nextInt(); //데스나이트가 도착해야하는 위치
        int distance = shortestPath(n, r1, c1, r2, c2);
        System.out.println(distance);
    }
}

