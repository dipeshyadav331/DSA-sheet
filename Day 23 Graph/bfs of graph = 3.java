
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(0);
        
        boolean[] vis = new boolean[V];
        vis[0] = true;
        
        while(!q.isEmpty()){
            int it = q.pop();
            ans.add(it);
            
            for(int i : adj.get(it)){
                if(!vis[i]){
                    vis[i] = true;
                    q.offer(i);
                }
            }
        }
        return ans;
    }
}