class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int [] first=new int[prices.length];
        int [] last=new int[prices.length];
        int [] profit=new int[prices.length];
        first[0]=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            first[i]=Math.min(first[i-1],prices[i]);
        }
        last[prices.length-1]=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--)
        {
           last[i]=Math.max(last[i+1],prices[i]); 
        }
        int maxprofit=-99999;
        for(int i=1;i<prices.length;i++)
        {
            int max=last[i]-first[i];
            if(max>maxprofit)
                maxprofit=max;
        }
        
        return maxprofit;
    }
}