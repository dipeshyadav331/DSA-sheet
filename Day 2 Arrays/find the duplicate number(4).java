class Solution {
    public int findDuplicate(int[] arr) {
        int l = 0 , n = arr.length , r = n+1;
        
        while(r - l > 1){
            int m = (l + r) >>> 1;
            
            int cnt = 0;
            for(int i : arr) if(i <= m) cnt++;
            
            if(m < cnt) r = m;
            else l = m;
        }
        
        return r;
    }
}