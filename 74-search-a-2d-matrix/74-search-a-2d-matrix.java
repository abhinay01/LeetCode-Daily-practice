class Solution {
    
    public boolean bs(int[][] nums, int target,int left,int right)
    {
        if(right>=left)
        {
        int mid=left+(right-left)/2;
        
        if((nums[mid][0]<target && nums[mid][nums[0].length-1]>target)||(nums[mid][0]==target)||(nums[mid][nums[0].length-1]==target))
        {
            for(int i=0;i<nums[0].length;i++)
            {
                if(nums[mid][i]==target)
                    return true;
            }
            // return false;
        }
        if(nums[mid][nums[0].length-1]<target)
          return  bs(nums,target,mid+1,right);
         return bs(nums,target,left,mid-1);
        // return -1;
        }
        else
            return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        return bs(matrix,target,0,matrix.length-1);
        // System.out.println((matrix.length-1)+" "+(matrix[0].length-1));
        // return true;
    }
}