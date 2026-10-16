class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int ans=0;

        int t=x;
        while(t>0){
            int d=t%10;
            ans=ans+d;
            t=t/10;


        }
        if(x%ans==0){
            return ans;
        }







        return -1;
        
    }
}