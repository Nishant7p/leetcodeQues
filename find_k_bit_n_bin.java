class Solution {
    public String reverse(String s){
       
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();

        

    }
    public String invert(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();

    }
    public char findKthBit(int n, int k) {
        String x="0";
        for(int i=1;i<n;i++){
            x=x+"1"+reverse(invert(x));


        }
        return x.charAt(k-1);

        
    }
}
