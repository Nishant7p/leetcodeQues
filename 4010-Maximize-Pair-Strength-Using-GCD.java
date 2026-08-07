class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);

    }
    public long maxPairStrength(int[] nums) {
        int n=nums.length;
        long max=0;
        for(int i=0;i<n;i++){
            int a=nums[i];
            for(int j=i+1;j<n;j++){
                int b=nums[j];
                long prod= 1L*a*b;
                int gcd=gcd(a,b);
                long sq= 1L*gcd*gcd;
                long curr=prod/sq;
                max=Math.max(max,curr);
            }


        } 
        return max;       
    }
}