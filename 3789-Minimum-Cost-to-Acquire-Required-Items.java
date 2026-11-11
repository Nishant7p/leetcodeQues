class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=0;
        
        if(costBoth<(long)cost1+cost2){
            long min=Math.min(need1,need2);
            ans=min*(long)costBoth;
            need1=need1-(int)min;
            need2=need2-(int)min;
            
        }
        ans=ans+(long)need1*Math.min(cost1,costBoth);
        ans=ans+(long)need2*Math.min(cost2,costBoth);
        return ans;
        
    }
}