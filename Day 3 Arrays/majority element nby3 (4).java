class Solution {
    private int inf = 0x3fffffff;
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0 , cnt2 = 0;
        int el1 = inf , el2 = inf;
        
        for(int i = 0 ; i < n ; i++){
            if(cnt1 == 0 && nums[i] != el2){
                el1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0 && nums[i] != el1){
                el2 = nums[i];
                cnt2 = 1;
            }
            else if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1 = 0; cnt2 = 0;
        for(int i : nums)
            if(i == el1) cnt1++;
            else if(i == el2) cnt2++;
        
        
        if(cnt1 > n/3 && cnt2 > n/3) return Arrays.asList(new Integer[]{el1 , el2});
        else if(cnt1 <= n/3 && cnt2 <= n/3) return Arrays.asList(new Integer[]{});
        return Arrays.asList(new Integer[]{cnt1>n/3?el1:el2});
    }
}