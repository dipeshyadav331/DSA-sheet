class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        
        boolean[] vis = new boolean[n];
        boolean[] clr = new boolean[n];
        
        for(int i = 0 ; i < n ; i++){
            if(!vis[i]){
                clr[i] = true;
                if(!dfs(i , vis , clr , graph)) return false;
            }    
        }
        return true;
    }
    
    boolean dfs(int i , boolean[] vis , boolean[] clr , int[][] graph){
        vis[i] = true;
        
        for(int it : graph[i]){
            if(!vis[it]){
                clr[it] = !clr[i];
                if(!dfs(it , vis , clr , graph)) return false;
            }
            else{
                if(clr[it] == clr[i]){
                    return false;
                }
            }
        }
        
        return true;
    }
}