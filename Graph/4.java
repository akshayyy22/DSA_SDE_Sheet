import java.util.*;

class Node {
    int first, second;
    Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean[] vis) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for (Integer neighbor : adj.get(node)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(new Node(neighbor, node));
                } 
                // If the neighbor is visited and not parent, it's a back edge (cycle)
                else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        // Check all components of the graph
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (checkForCycle(adj, i, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add undirected edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        // Uncomment the below line to introduce a cycle: (4-1)
        // adj.get(4).add(1);
        // adj.get(1).add(4);

        Solution sol = new Solution();
        boolean hasCycle = sol.isCycle(V, adj);

        System.out.println("Cycle detected: " + hasCycle);
    }
}
