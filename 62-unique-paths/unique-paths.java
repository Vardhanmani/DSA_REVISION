class Solution {
    public static int helper(int row, int col, int m, int n, int[][] memo) {
        if (row == m - 1 && col == n - 1) {
            return 1;
        }
        if (row >= m || col >= n) {
            return 0;
        }
        if (memo[row][col] != -1) {
            return memo[row][col];
        }
        
        int A = helper(row + 1, col, m, n, memo);
        int B = helper(row, col + 1, m, n, memo);
        return memo[row][col] = A + B;
    }
    
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1); 
        }
        return helper(0, 0, m, n, memo);
    }
}