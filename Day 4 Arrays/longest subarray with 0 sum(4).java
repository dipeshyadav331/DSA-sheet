class GfG{
    int maxLen(int arr[], int n){
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0 , 0);
        
        int k = 0 , maxLen = 0;
        for(int i = 0 ; i < n ; k+=arr[i++]){
            if(map.containsKey(k)) maxLen = Math.max(maxLen , i - map.get(k));
            else map.put(k , i);
        }
        
        if(map.containsKey(k)) maxLen = Math.max(maxLen , n - map.get(k));
        return maxLen;
        
    }
}