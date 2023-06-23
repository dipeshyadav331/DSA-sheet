import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t-- > 0){
			int n = scn.nextInt() , c = scn.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0 ; i < n ; i++){
				arr[i] = scn.nextInt();
			}
			
			Arrays.sort(arr);
			
			int l = 0 , r = (int)1e9 + 1;
			
			while(r - l > 1){
				int m = (l + r) >> 1;
				
				if(isPossible(arr , m , c)) l = m;
				else r = m;
			}
			
			System.out.println(l);	
		}
	}
	
	public static boolean isPossible(int[] arr , int m , int c){
		int ans = 1;
		int first = arr[0];
		for(int i = 1 ; i < arr.length ; i++){
			if(arr[i] - first >= m){
				ans++;
				first = arr[i];
			}
		}
		
		if(ans >= c) return true;
		return false;
	}
}