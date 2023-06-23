public class Solution {
    public static int NthRoot(int n, int m) {
        if(n == 1){
            return m;
        }

        int l = -1 , r = 31;
        while(r - l > 1){
            int mid = (l + r) / 2;

            long res = pow(mid , n);

            if(res == m) return mid;
            else if(res > m) r = mid;
            else l = mid;
        }

        return -1;
    }

    public static long pow(long a , long b){
        long ans = 1;
        while(b > 0){
            if((b&1) == 0){
                a = a * a;
                b = b >> 1;
            }
            else{
                ans = ans * a;
                b = b - 1;
            }
        }
        return ans;
    }
}
