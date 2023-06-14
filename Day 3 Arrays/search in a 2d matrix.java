class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = -1 , m = matrix.length , n = matrix[0].length , r = m * n;
        
        while(r - l > 1){
            int mid = (l + r) / 2;
            
            if(matrix[mid/n][mid%n] == target) return true;
            else if(matrix[mid/n][mid%n] > target) r = mid;
            else l = mid;
        }
        
        return false;
    }
}