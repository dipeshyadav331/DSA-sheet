public class Solution {
    public int findMedian(int[][] A) {
        int n = A.length, M = A[0].length;
        
        int l = 0 , r = 1000000001;
        
        while (r - l > 1) {
            int m = (l + r) >> 1;
            
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += countSmallerThanMid(A[i], m);
            }
            
            if (cnt <= (n * M) / 2) l = m;
            else r = m;
        }
        
        return r;
    }
    
    public static int countSmallerThanMid(int[] A, int mid) {
        int l = -1 , r = A.length;
        
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (A[m] <= mid) {
                l = m;
            } else {
                r = m;
            }
        }
        
        return r;
    }
}
