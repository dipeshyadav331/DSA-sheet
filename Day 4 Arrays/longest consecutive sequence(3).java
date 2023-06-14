class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i : nums) set.add(i);
        
        int maxLen = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int len = 0;
                
                while(set.contains(i)){
                    i++; len++;
                }
                
                if(len > maxLen) maxLen = len;
            }
        }
        
        return maxLen;
    }
}