
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        for(int i = 0 ; i < V ; i++){
            if(!vis[i]){
                dfs(i , adj , vis , ans);
            }
        }
        
        return ans;
    }
    
    public void dfs(int i , ArrayList<ArrayList<Integer>> adj , boolean[] vis , ArrayList<Integer> ans){
        vis[i] = true;
        ans.add(i);
        for(int it : adj.get(i)){
            if(!vis[it]){
                dfs(it , adj , vis , ans);
            }
        }
    }
}