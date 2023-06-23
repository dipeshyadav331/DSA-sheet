public class Solution {
    public int books(int[] arr , int b) {
        int n = arr.length;
        if(b > n) return -1;
        
        long sum = 0;
        for(int i : arr) sum = sum + i;
        
        long l = 0 , r = sum+1;
        
        while(r - l > 1){
            long m = (l + r) >> 1;
            
            if(check(m , arr , b)) r = m;
            else l = m;
        }
        
        return (int)r;
    }
    
    boolean check(long m , int[] arr , int b){
        long sum = 0;
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > m) return false;
            
            if(sum + arr[i] > m){
                ans++;
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
        }
        
        if(ans < b) return true;
        else return false;
    }
}
