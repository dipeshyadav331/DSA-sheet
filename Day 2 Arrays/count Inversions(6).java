class Solution{
    static long inversionCount(long arr[], long N){
        return mergeSort(0 , (int)N - 1  , arr);
    }
    
    static long mergeSort(int l , int r ,  long[] arr){
        long ans = 0;
        if(l < r){
            int m = (l + r) / 2;
            
            ans += mergeSort(l , m , arr);
            ans += mergeSort(m+1 , r , arr);
            
            ans += mergeTwoSortedArray(l , r , m , arr);
        }
        
        return ans;
    }
    
    static long mergeTwoSortedArray(int l , int r , int m , long[] arr){
        int n1 = m - l + 1 , n2 = r - m;
        
        long[] a1 = new long[n1];
        long[] a2 = new long[n2];

        long ans = 0;
        
        int idx = 0;
        for(int i = l ; i <= m ; i++) a1[idx++] = arr[i];
        idx = 0;
        for(int i = m+1 ; i <= r ; i++) a2[idx++] = arr[i];
        
        int i = 0 , j = 0 , k = l;
        
        while(i < n1 && j < n2){
            if(a1[i] > a2[j]){
                arr[k++] = a2[j++];
                ans = ans + n1 - i;
            }
            else arr[k++] = a1[i++];
        }
        
        while(i < n1) arr[k++] = a1[i++];
        while(j < n2) arr[k++] = a2[j++];
        
        return ans;
    }
}