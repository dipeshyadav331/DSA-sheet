class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l = -1 , n = arr.length , r = n;
        
        if(n == 1) return arr[0];
        else if(arr[0] != arr[1]) return arr[0];
        else if(arr[n-1] != arr[n-2]) return arr[n-1];
        
        while(r - l > 1){
            int m = (l + r) >>> 1;
            
            if((m&1) == 0){
                if(arr[m] == arr[m+1]) l = m;
                else r = m;
            }
            else{
                if(arr[m] == arr[m-1]) l = m;
                else r = m;
            }
        }
        
        return arr[r];
    }
}