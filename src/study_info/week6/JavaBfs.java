package study_info.week6;

import java.util.LinkedList;
import java.util.Queue;

public class JavaBfs {
    static int[][] graph = {
            {},
            {2, 3, 8},
            {1, 7},
            {1, 4, 5},
            {3, 5},
            {3, 4},
            {7},
            {2, 6, 8},
            {1, 7},
    };
    static boolean[] vis = new boolean[9];

    public static void main(String[] args) {
        bfs(1);
    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for(int node: graph[x]) {
                if (!vis[node]) {
                    q.offer(node);
                    vis[node] = true;
                }
             }
        }
    }
}
