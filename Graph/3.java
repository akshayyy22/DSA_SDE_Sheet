class Solution {
    public static void dfs(int node , boolean vis[] , ArrayList<ArrayList<Integer>> adj ,  ArrayList<Integer> ls ){
        vis[node] = true;
        ls.add(node);

        for(Integer it : adj.get(node)){
            if(!vis[it]){
                vis[it] = true;
                dfs(it,vis,adj,ls);
            }
        }

    }
    public ArrayList<Integer> DfsOfGraph(ArrayList<ArrayList<Integer>> adj){
        int V = adj.size();
        boolean vis[] = new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();
        vis[0] = true;
        dfs(0 , vis , adj , ls);
        return ls;
    }
}