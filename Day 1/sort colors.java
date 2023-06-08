class Solution {
    public void sortColors(int[] nums) {
        int i = 0 , j = 0 , n = nums.length , k = n-1;
        
        while(i <= k){
            if(nums[i] == 0){
                swap(i , j , nums);
                i++;
                j++;
            }
            else if(nums[i] == 1) i++;
            else{
                swap(i , k , nums);
                k--;
            }
        }
    }
    
    void swap(int i , int j , int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}