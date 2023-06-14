class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length , max = 0;
        
        var map = new HashMap<Character , Integer>();
        int l = 0 , r = 0;
        
        while(r < n){
            if(map.containsKey(ch[r])) l = Math.max(l , map.get(ch[r]) + 1);
            
            map.put(ch[r] , r);
            max = Math.max(max , r - l + 1);
            r++;
        }
        
        return max;
    }
}