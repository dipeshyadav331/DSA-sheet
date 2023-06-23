class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        return getKthElementFromMergedArray(arr1 , arr2 , k , 0 , 0);
    }
    
    public long getKthElementFromMergedArray(int[] nums1 , int[] nums2 , int k , int s1 , int s2){
        if(s1 >= nums1.length) return nums2[s2 + k - 1];
        if(s2 >= nums2.length) return nums1[s1 + k - 1];
        
        if(k == 1) return Math.min(nums1[s1] , nums2[s2]);
        
        int el1 = Integer.MAX_VALUE;
        if(s1 + k/2 - 1 < nums1.length) el1 = nums1[s1 + k/2 - 1];
        
        int el2 = Integer.MAX_VALUE;
        if(s2 + k/2 - 1 < nums2.length) el2 = nums2[s2 + k/2 - 1];
        
        if(el1 < el2) return getKthElementFromMergedArray(nums1 , nums2 , k-k/2 , s1 + k/2 , s2);
        else return getKthElementFromMergedArray(nums1 , nums2 , k-k/2 , s1 , s2 + k/2);
    }
}