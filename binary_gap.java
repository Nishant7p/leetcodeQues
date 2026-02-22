class Solution {
    public int binaryGap(int n) {
        int x=1;
        int ans=0;
        int temp=-1;
        while(n>0){
            if((n&x)==1){
                if(temp!=-1){
                    ans=Math.max(ans,temp+1);

                }
                temp=0;
               
                

            }
            else{
                if(temp!=-1){
                    temp++;

                }
                
            }
            n=n>>1;


        }
        return ans;
        
    }
}
