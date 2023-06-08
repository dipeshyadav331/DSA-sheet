class Solution {
    public void setZeroes(int[][] arr) {
        boolean flag = false;
        
        int n = arr.length , m = arr[0].length;
        
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++)
                if(arr[i][j] == 0){
                    if(i!= 0) arr[i][0] = 0;
                    else flag = true;
                    arr[0][j] = 0;
                }
           
        for(int i = 1 ; i < n ; i++)
            for(int j = 1 ; j < m ; j++)
                if(arr[i][0] == 0 || arr[0][j] == 0)
                    arr[i][j] = 0;
        
        if(flag)
            for(int i = 1 ; i < m ; i++)
                 arr[0][i] = 0;
            
        
        if(arr[0][0] == 0)
            for(int i = 0 ; i < n ; i++)
                arr[i][0] = 0;
        
        if(flag) arr[0][0] = 0;
    }
}