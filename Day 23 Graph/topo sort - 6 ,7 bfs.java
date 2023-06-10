class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int n = V;
        // add your code here
        int[] in = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            for(int j : adj.get(i)){
                in[j]++;
            }
        }
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        for(int i =0  ; i < n ; i++) if(in[i] == 0) q.add(i);
        
        int[] ans = new int[n];
        int idx = 0;
        while(!q.isEmpty()){
            int i = q.pollFirst();
            ans[idx++] = i;    
            for(int it : adj.get(i)){
                in[it]--;
                if(in[it] == 0) q.offer(it);
            }
        }
        return ans;
    }
}
