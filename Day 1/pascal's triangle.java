class Solution {
    private List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> generate(int n) {
        if(list.size() == 0){
            fun();
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            ans.add(list.get(i));
        }
        return ans;
    }
    
    void fun(){
        for(int i = 1 ; i < 31 ; i++){
            List<Integer> l = new ArrayList<>();
            int prev = 1;
            l.add(prev);
            for(int j = 1 ; j < i ; j++){ 
                prev = prev * (i-j)/j;
                l.add(prev);
            }
            list.add(l);
        }
    }
}