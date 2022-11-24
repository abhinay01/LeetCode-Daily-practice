class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n1=-1,n2=-1;
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==n1)
               c1++;
            else if(nums[i]==n2)
                c2++;
            else if(c1==0)
            {
                n1=nums[i];
                c1++;
            }
            else if(c2==0)
            {
                n2=nums[i];
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        List<Integer> ans=new ArrayList();
        int ir=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==n1)
                ir++;
            else if(nums[i]==n2)
                j++;
        }
        if(ir>nums.length/3)
            ans.add(n1);
        if(j>nums.length/3)
            ans.add(n2);
        return ans;
    }
}