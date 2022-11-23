class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix[0].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         System.out.println(matrix[i][j]);
        //     }
        //      System.out.println();
        // }
        for(int i=0;i<matrix.length;i++)
        {
            int last=matrix[0].length-1;
            for(int j=0;j<matrix[0].length/2;j++)
            {
                int temp=matrix[i][last];
                matrix[i][last]=matrix[i][j];
                matrix[i][j]=temp;
                last--;
            }
        }
    }
}