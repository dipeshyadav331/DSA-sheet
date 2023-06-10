class Solution {
    public boolean canFinish(int n , int[][] p) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++) adj.add(new ArrayList<>());
        
        for(int i = 0 ; i < p.length ; i++){
            int a = p[i][0] , b = p[i][1];
            adj.get(b).add(a);
        }
        
        int[] vis = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(vis[i] == 0){
                if(dfs(i , adj , vis)) return false;
            }
        }
        return true;
    }
    
    boolean dfs(int i , List<List<Integer>> adj , int[] vis){
        vis[i] = 1;
        for(int it : adj.get(i)){
            if(vis[it] == 0){
                if(dfs(it , adj , vis)) return true;
            }
            else if(vis[it] == 1){
                return true;
            }
        }
        vis[i] = 2;
        return false;
    }
}