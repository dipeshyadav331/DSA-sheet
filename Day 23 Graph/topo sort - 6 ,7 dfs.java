class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int n = V;
        // add your code here
        Stack<Integer> st = new Stack<>();
        
        boolean[] vis = new boolean[n];
        
        for(int i = 0 ; i < n ; i++){
            if(!vis[i]){
                dfs(i , st , vis , adj);
            }
        }
        
        int idx = 0;
        int[] ans = new int[n];
        while(!st.isEmpty()){
            ans[idx++] = st.pop(); 
        }
        
        return ans;
        
    }
    
    public static void dfs(int i , Stack<Integer> st , boolean[] vis , ArrayList<ArrayList<Integer>> adj){
        vis[i] = true;
        
        for(int it : adj.get(i)){
            if(!vis[it]){
                dfs(it , st , vis , adj);
            }
        }
        
        st.push(i);
    }
}
