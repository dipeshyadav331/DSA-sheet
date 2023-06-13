class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr , (a , b)->{
            return a[0] - b[0];            
        });
        
        List<int[]> list = new ArrayList<>();
        
        int sz = 0;
        for(int[] a : arr){
            if(list.isEmpty()) list.add(a);
            else{
                int[] ma = list.get(sz);
                if(a[0] > ma[1]){
                    list.add(a);
                    sz++;
                }
                else ma[1] = Math.max(a[1] , ma[1]);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
