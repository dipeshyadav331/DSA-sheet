class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(0 , nums.length - 1 , nums); 
    }
    
    int mergeSort(int l , int r , int[] arr){
        int ans = 0;
        
        if(l < r){
            int m = (l + r) >>> 1;
            ans += mergeSort(l , m , arr);
            ans += mergeSort(m+1 , r , arr);
            
            ans += mergeTwoSortedArrays(l , m , r , arr);
        }
        
        return ans;
    }
    
    int mergeTwoSortedArrays(int l , int m , int r , int[] arr){
        int n1 = m-l+1 , n2 = r-m;
        
        int[] a1 = new int[n1] , a2 = new int[n2];
        
        int idx = 0;
        for(int i = l ; i <= m ; i++) a1[idx++] = arr[i];
        
        idx = 0;
        for(int i = m+1 ; i <= r ; i++) a2[idx++] = arr[i];
        
        int i = 0 , j = 0 , k = l;
        while(i < n1 && j < n2)
            if(a1[i] > a2[j]) arr[k++] = a2[j++];
            else arr[k++] = a1[i++];
        
        while(i < n1) arr[k++] = a1[i++];
        while(j < n2) arr[k++] = a2[j++];
        
        int ans = 0;
         
        int x = 0, y = 0;
        while(x < n1 && y < n2){
            if(a1[x] > 2L * a2[y]){
                ans += (n1 - x);
                y++;
            }
            else x++;
        }
        
        return ans;
    }
}