public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int low = 0;
        int high = rows * cols - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            int midvalue = matrix[mid / cols][mid % cols];
            if(midvalue == target){
                return true;
            }else if(midvalue < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}