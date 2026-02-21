class Solution {
    public int helper(int num){
        int c=0;
        while(num>0){
            c++;
            num=num&(num-1);
        }
        if(c < 2) return 0;
        for(int i=2;i*i<=c;i++){
            if(c%i==0){
                return 0;
            }








        }
        return 1;



    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            ans=ans+helper(i);
            

        }

        return ans;

    }
}
