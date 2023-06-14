class Solution {
    public List<List<Integer>> fourSum(int[] arr , int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int k = 0 ; k < n ; k++){
            if(k > 0 && arr[k] == arr[k-1]) continue;
            for(int l = k+1 ; l < n ; l++){
                if(l > k+1 && arr[l] == arr[l-1]) continue;
                
                int i = l+1 , j = n-1;
                long sum2 = arr[k] + arr[l];
                while(i < j){
                    long sum = sum2 + arr[i] + arr[j];
                    if(sum < target) i++;
                    else if(sum > target) j--;
                    else{
                        List<Integer> x = new ArrayList<>();
                        x.add(arr[i]); x.add(arr[j]); x.add(arr[k]); x.add(arr[l]);
                        ans.add(x);
                        
                        while(i < j && arr[i] == arr[i+1]) i++;
                        while(i < j && arr[j] == arr[j-1]) j--;
                        
                        i++; j--;
                    }
                }
            }
        }
        return ans;
        
    }
}