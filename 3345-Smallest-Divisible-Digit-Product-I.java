class Solution {
    public int smallestNumber(int n, int t) {
        int x=n;
        while(x>=n){
            int temp=x;
            int p=1;
            while(temp>0){
                int d=temp%10;
                p=p*d;
                temp=temp/10;

            }
            
            if(p%t==0){
                return x;
            }
            x++;
        }
        return 0;

        
    }
}