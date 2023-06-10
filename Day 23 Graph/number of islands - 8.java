class Solution {
    private int[] r = {-1,0,1,0};
    private int[] c = {0,1,0,-1};
    public int numIslands(char[][] grid) {
        int n = grid.length , m = grid[0].length;
        
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++)
                if(grid[i][j] == '1'){
                    fun(i , j , grid , n , m);
                    ans++;
                }
        
        return ans;
    }
    
    void fun(int i , int j , char[][] grid , int n , int m){
        grid[i][j] = 'd';
        
        for(int x = 0 ; x < 4 ; x++){
            int p1 = i + r[x] , p2 = j + c[x];
            if(withinBounds(p1 , p2 , n , m , grid)) fun(p1 , p2 , grid , n , m);
        }
    }
    
    boolean withinBounds(int i , int j , int n , int m , char[][] grid){
        boolean x = i>=0 && j>=0 && i<n && j<m;
        if(!x) return false;
        return grid[i][j] == '1';
    }
}