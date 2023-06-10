class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        
        boolean[] vis = new boolean[n];
        boolean[] clr = new boolean[n];
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        
        for(int x = 0 ; x < n ; x++){
            if(!vis[x]){
                q.offer(x);
                vis[x] = true;
                clr[x] = true;
                while(!q.isEmpty()){
                    int z = q.pollFirst();

                    for(int i : graph[z]){
                        if(!vis[i]){
                            q.offer(i);
                            vis[i] = true;
                            clr[i] = !clr[z];
                        }
                        else{
                            if(clr[i] == clr[z]) return false;
                        }
                    }

                }
            }
        }
        
        return true;
    }
}