class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0];
        int ans = 0;
        for(int i = 1 ; i < arr.length ; i++){
            ans = Math.max(ans , arr[i] - min);
            min = Math.min(min , arr[i]);
        }
        return ans;
    }
}