class Solution {
    public boolean canFinish(int n , int[][] p) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++) adj.add(new ArrayList<>());
        
        int[] in = new int[n];
        for(int i = 0 ; i < p.length ; i++){
            int a = p[i][0] , b = p[i][1];
            adj.get(b).add(a);
            in[a]++;
        }
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        for(int i = 0 ; i < n ; i++) if(in[i] == 0) q.offer(i);
        
        int x = 0;
        while(!q.isEmpty()){
            int a = q.pollFirst();
            x++;
            for(int it : adj.get(a)){
                in[it]--;
                
                if(in[it] == 0){
                    q.offer(it);
                }
            }
        }
        
        return x==n;
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