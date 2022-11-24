class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int r=0;
        int col=n-1;
        while(r<m && col>=0)
        {
            int curr=matrix[r][col];
            if(curr == target)
                return true;
            else if(curr>target)
                col--;
            else
                r++;
        }
        return false;
    }
}