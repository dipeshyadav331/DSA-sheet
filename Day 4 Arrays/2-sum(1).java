class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer , Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int look = target - nums[i];
            if(map.containsKey(look)) return new int[]{map.get(look) , i};
            
            map.put(nums[i] , i);
        }
        
        return new int[0];
    }
}