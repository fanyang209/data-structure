public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        
        for(int i = 1; i < n; i++){
        	for(int j = 0; j <= i; j++){
        		// 每行第一个元素
        		if(j == 0){
        			dp[i][j] = dp[i - 1][j];
        		}
        		// 每行最后一个元素
        		if(j == i){
        			dp[i][j] = dp[i - 1][j - 1];
        		}

        		// 中间值
        		if(j > 0 && j < i){
        			dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
        		}
        		dp[i][j] +=  triangle.get(i).get(j);
        	}
        }
       int min = Integer.MAX_VALUE;
       for(int i = 0; i < n; i++){
       	min = Math.min(min, dp[n - 1][i]);
       }
       return min;
    }
}