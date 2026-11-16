class Solution {
    public String process(String s ,int k){
        StringBuilder sb=new StringBuilder();
        int ans=0;

        for(int i=0;i<s.length();i++){
            
            ans=ans+s.charAt(i)-'0';
            if((i+1)%k==0){
                sb.append(String.valueOf(ans));
                ans=0;

            }


        }
        if(s.length()%k!=0){

        
        sb.append(String.valueOf(ans));}
        return sb.toString();
    }
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int i=0;

        String x=s;


        while(x.length()>k){
            x=process(x,k);
            
        }




        return x;

       

        
    }
}