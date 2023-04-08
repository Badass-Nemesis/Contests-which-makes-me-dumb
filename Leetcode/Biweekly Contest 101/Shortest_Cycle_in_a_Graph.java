import java.util.*;

class Solution {
    public static int min;

    public static void dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int[] dist) {

        for (Integer neighbour : adj.get(node)) {
            if (dist[neighbour] == -1) {
                visited[neighbour] = true;
                dist[neighbour] = dist[node] + 1;
                dfs(neighbour, node, adj, visited, dist);
            } else if (neighbour != parent) {
                min = Math.min(min, Math.abs(dist[node] - dist[neighbour]) + 1);
            }
        }

        dist[node] = -1;
    }

    public int findShortestCycle(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                int[] dist = new int[n];
                Arrays.fill(dist, -1);
                dist[i] = 1;
                dfs(i, -1, adj, visited, dist);
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        } else {
            return min;
        }
    }
}