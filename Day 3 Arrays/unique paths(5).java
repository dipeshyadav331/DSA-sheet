class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[m][n];
        return fun(0 , 0 , m , n , dp);
    }
    
    int fun(int i , int j , int m , int n , Integer[][] dp){
        if(i == m-1 && j == n-1) return 1;
        else if(i >= m || j >= n) return 0;
        else if(dp[i][j] != null) return dp[i][j];
        else return dp[i][j] = fun(i+1 , j , m , n , dp) + fun(i , j+1 , m , n , dp);
    }
}