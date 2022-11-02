package week6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java_1260 {
    static boolean[] vis;
    static int[][] graph;
    static int N, M, V;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 정점 개수
        M = sc.nextInt(); // 간선 개수
        V = sc.nextInt(); // 정점 번호
        sc.nextLine();

        vis = new boolean[N + 1];
        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }
        dfs(V);
        vis = new boolean[N + 1];
        System.out.println();
        bfs(V);

    }
    public static void dfs(int start) {
        vis[start] = true;
        System.out.print(start + " ");
        for(int node = 1; node < N + 1; node++) {
            if (graph[start][node] == 1 && !vis[node]) {
                dfs(node);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        vis[start] = true;
        System.out.print(start + " ");
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int node = 1; node < N + 1; node++) {
                if (graph[x][node] == 1 && !vis[node]) {
                    q.offer(node);
                    vis[node] = true;
                    System.out.print(node + " ");
                }
            }
        }
    }
}
