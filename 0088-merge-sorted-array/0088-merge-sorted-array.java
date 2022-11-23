class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(i<m+n && j<n)
        {
            if(nums1[i]==0 && i>=m)
            {
                nums1[i]=nums2[j];
                i++;
                j++;
            }
            else if(nums1[i]<=nums2[j])
            {
                i++;
            }
            else
            {
                int t=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=t;
                for(int r=j+1;r<n;r++)
                {
                    if(nums2[r]<nums2[r-1])
                    {
                        int t1=nums2[r];
                        nums2[r]=nums2[r-1];
                        nums2[r-1]=t1;
                    }
                }
                i++;
            }
        }
    }
}