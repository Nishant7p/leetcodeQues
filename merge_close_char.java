class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int ch=1;
        while(ch==1){
            ch=0;
            int n=sb.length();
            for(int i=0;i<n;i++){
                char c=sb.charAt(i);
                int change=Math.min(i+k,n-1);
                for(int j=i+1;j<=change;j++){
                    if(sb.charAt(j)==c){
                        sb.deleteCharAt(j);
                        ch=1;
                        break;
                    }
                }
                if(ch==1){
                    break;
                }
            }
        }
        return sb.toString();
        
        
    }
}©leetcode
