public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int temp;
        
        // 先按对角线反转
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
       
       // 再按水平中轴线反转
       for(int i = 0; i < n; i++)
        for(int j = 0; j < n / 2; j++){
            temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - 1 - j];
            matrix[i][n - 1 - j] = temp;
        }
    }
}