class Solution {
    public double myPow(double x, int tmp) {
        long n = tmp;
        if(n < 0) n = -n;
        
        double ans = 1.0;
        while(n > 0){
            if((n&1)==0){
                x = x * x;
                n = n >> 1;
            }
            else{
                ans = ans * x;
                n = n - 1;
            }
        }
        
        if(tmp < 0) ans = 1.0/ans;
        return ans;
    }
}