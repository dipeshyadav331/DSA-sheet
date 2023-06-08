class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        if(n <= 1){
			return;
		}
		
		int p = n-2;
		while(p >= 1 && arr[p] >= arr[p+1]){
			p--;
		}
		
		int q = n-1;
		while(q > p && arr[p] >= arr[q]){
			q--;
		}
		
		if(q == 0){
			for(int i = 0 ; i < n/2 ; i++){
				int temp = arr[i];
				arr[i] = arr[n-i-1];
				arr[n-i-1] = temp;
			}
			return;
		}
		
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		
		int i = p+1;
		int j = n-1;
		while(i < j){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
    }
}