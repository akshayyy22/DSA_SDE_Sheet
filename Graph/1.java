// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        //Adjacency Matrix representation
        int[][] adj = new int[¯n+1][m+1];
        adj[v][u] = 1;
        adj[u][v] = 1;
        
        
        //Adjacency list representation 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0 ; i<= n ; i++){
            adj.add(new ArrayList<Integer>());
            
            //edge 1 --> 2
            adj.get(1).add(2);
            adj.get(2).add(1);
        }
        
        

    
            
   
    }
}