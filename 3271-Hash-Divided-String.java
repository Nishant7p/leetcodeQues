class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        int m=n/k;
        StringBuilder sb=new StringBuilder();


        int i=0;
        while(i<n){
            int cnt=k;
            int sum=0;
            while(cnt>0){
                char c=s.charAt(i);
                sum+=(c-'a');
                cnt--;
                i++;

            }
            sum=sum%26;
            char c=(char)('a'+sum);
            sb.append(c);


        }











        return sb.toString();
        
    }
}