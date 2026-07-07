class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long ans=0;
        long m=0;
        int t=n;
        ArrayList<Integer> arr=new ArrayList<>();

        while(t>0){
            int d=t%10;
            t=t/10;
            sum=sum+d;
            if(d!=0){
                arr.add(d);
            }

        }
        for(int i=0;i<arr.size();i++){

            m=m+arr.get(arr.size()-i-1);
            m=m*10;
        }
        m=m/10;











        ans=sum*m;






        return ans;
        
    }
}