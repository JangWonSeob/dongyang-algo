package week6;

public class JavaDfs {
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
        dfs(1);
    }

    public static void dfs(int x) {
        vis[x] = true;
        System.out.print(x + " ");
        for (int node: graph[x]) {
            if (!vis[node]) {
                dfs(node);
            }
        }
    }
}
