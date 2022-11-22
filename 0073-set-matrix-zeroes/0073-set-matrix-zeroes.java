class Solution {
    public void setZeroes(int[][] matrix) {
        boolean col=false;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(j==0 && matrix[i][j]==0)
                    col=true;
                else if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        // System.out.println(col);
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         System.out.println(matrix[i][j]);
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<matrix.length;i++)
        // {
        //     if(matrix[i][0]==0)
        //     {
        //         for(int j=0;j<matrix[0].length;j++)
        //         {
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         System.out.println(matrix[i][j]);
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<matrix[0].length;i++)
        // {
        //     if(matrix[0][i]==0)
        //     {
        //         for(int j=0;j<matrix.length;j++)
        //         {
        //             matrix[j][i]=0;
        //         }
        //     }
        // }
        
        for(int i=matrix.length-1;i>=0;i--)
        {
            for(int j=matrix[0].length-1;j>=0;j--)
            {
                if(j==0 && col)
                    {
                    // System.out.println(i+" "+j+" "+col);
                        matrix[i][j]=0;
                    }
                else
                if((matrix[i][0]==0 || matrix[0][j]==0) && j!=0)
                {
                     matrix[i][j]=0;
                }
            }
        }
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         System.out.println(matrix[i][j]);
        //     }
        //     System.out.println();
        // }
        
    }
}