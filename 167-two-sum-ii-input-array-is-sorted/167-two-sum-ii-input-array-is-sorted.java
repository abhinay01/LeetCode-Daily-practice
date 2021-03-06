class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first=0;
        int last=numbers.length-1;
        while(last>first)
        {
            int sum=numbers[first]+numbers[last];
            if(sum==target)
            {
                return new int[]{first+1,last+1};
            }
            else if(sum>target)
                last--;
            else
                first++;
        }
        return new int[]{};
    }
}