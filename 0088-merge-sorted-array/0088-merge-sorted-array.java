class Solution {
    public void shellSort(int [] v, int n){
        int gap =(int) Math.ceil(n/2);
        while(gap>=1){
            int i=0, j=gap;
            while(j<n){
                if(v[i]>v[j])
                {
                    int t=v[i];
                    v[i]=v[j];
                    v[j]=t;
                    // swap(v[i], v[j]);
                }
                i++;
                j++;
            }
            if (gap==1) return;
            gap =(int) Math.ceil((float)gap/2);
        }
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m, j=0; j<n; i++, j++)
            nums1[i] = nums2[j];
        shellSort(nums1, nums1.length);
    }
}