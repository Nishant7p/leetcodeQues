class Solution {
    public int sumOfNumbers(int l, int r, int k) {
        long mod=1000000007;
        long n=(long)r-l+1;
        long sum=(n%mod*(((long)l+r)%mod)%mod*500000004)%mod;
        long c=1;
        long x=n%mod;
        int check=k-1;
        while(check>0){
            if((check)%2==1){
                c=(c*x)%mod;
                
            }
            x=(x*x)%mod;
            check=check/2;
        }
        long val=sum*c%mod;
        long y=10;
        long temp=1;
        int p=k;
        while(p>0){
            if(p%2==1){
                temp=(temp*y)%mod;
               
                
            }
             y=(y*y)%mod;
            p=p/2;
        }
        long ans=(temp-1+mod)%mod*111111112%mod;
        return (int)((val*ans)%mod);
    }
}©leetcode
