class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int p=1;
        int s=0;
        while(t>0){
            int d=t%10;
            t=t/10;
            s=s+d;
            p=p*d;


        }
        int sum=s+p;
        if(n%sum==0){
            return true;
        }
        return false;
        
    }
}