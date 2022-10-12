import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Week6_1260 {
    public static boolean[] visited;
    static int[][] graph;

    public static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");
        for (int node : graph[x]) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for (int node : graph[x]) {
                if (!visited[node]) {
                    q.offer(node);
                    visited[node] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n, m, v;
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        graph = new int[m + 1][m + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[i + 1][0] = x;
            graph[i + 1][1] = y;
            System.out.println(Arrays.toString(graph[i + 1]));
        }

//        dfs(v);
//        bfs(v);

    }
}
