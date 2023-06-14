public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		Map<Integer , Integer> map = new HashMap<>();
		map.put(0 , 1);

		int xor = 0 , ans = 0; 
		for(int i = 0 ; i < arr.size() ; i++){
			xor = xor ^ arr.get(i);
			
			int look = xor ^ x;
			if(map.containsKey(look)) ans = ans + map.get(look);
			map.put(xor , map.getOrDefault(xor , 0) + 1);
		}

		return ans;
	}
}