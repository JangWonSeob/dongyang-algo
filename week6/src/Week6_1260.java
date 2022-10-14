import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Week6_1260 {
    static int[][] graph;
    static boolean[] visited;
    static int N;
    static int M;
    static int V;

    public static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");
        for (int y = 0; y < N + 1; y++) {
            if (graph[x][y] == 1 && !visited[y]) {
                dfs(y);
            }
        }
    }

    public static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;
        System.out.print(i + " ");
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int y = 0; y < N + 1; y++) {
                if (graph[x][y] == 1 && !visited[y]) {
                    System.out.print(y + " ");
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();       // 정점의 개수
        M = sc.nextInt();       // 간선의 개수
        V = sc.nextInt();       // 시작 번호

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }

        System.out.println("dfs");
        dfs(V);
        Arrays.fill(visited, false);
        System.out.println();
        System.out.println("bfs");
        bfs(V);

    }
}
