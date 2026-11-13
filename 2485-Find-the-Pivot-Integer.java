class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }

        int ans=0;

        int[] pre=new int[n+1];
        int[] suff=new int[n+2];

        //HashSet<Integer> set=new HashSet();
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+i;
           
           
        }
        for(int i=n;i>=0;i--){
            suff[i]=suff[i+1]+i;
            //set.add(suff[i]);
            


        }

        for(int i=1;i<=n;i++){
            if(pre[i]==suff[i]){
                ans=i;
                return ans;
            }

        }
        return -1;



















        //return ans;
        
    }
}