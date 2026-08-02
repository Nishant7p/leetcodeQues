class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int a=0;
        int b=0;
        int t=0;
        for(int i=piles.length-1;i>=0;i--){
            if(t%2==0){
                t++;
                a=piles[i]+a;
                
            }
            else{
                t++;
                b=piles[i]+b;
            }
        }
        if(a>b){
            return true;
        }
        return false;
        
        
        
    }
}