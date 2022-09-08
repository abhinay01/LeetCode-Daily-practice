class Solution {
    public void sortColors(int[] nums) {
        int zero=0,two=0,one=0;
        for(int i:nums)
        {
            if(i==0)
                zero++;
            if(i==1)
                one++;
            if(i==2)
                two++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zero>0){
            nums[i]=0;
                zero--;
                continue;
            }
             if(one>0){
            nums[i]=1;
                one--;
                continue;
            }
            if(two>0){
            nums[i]=2;
                two--;
                continue;
            }
        }
    }
}