class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0 , me = 0 , n = nums.length;
        
        for(int i = 0 ; i < n ; i++){
            if(cnt == 0){
                me = nums[i];
                cnt++;
            }
            else if(nums[i] == me) cnt++;
            else cnt--;
        }
        
        return me;
    }
}