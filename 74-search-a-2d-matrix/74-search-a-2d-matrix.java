class Solution {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int r = 0;
        int c = col - 1;
        // Binary Search
        while (r < row && c >= 0) {
            int current = matrix[r][c];
            if (current == target) {
                return true;
            }
            if (current > target) {
                c--;
            }
            else {
                r++;
            }
        }
        return false;
    }
}