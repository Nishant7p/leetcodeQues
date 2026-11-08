class Solution {
    public int countAsterisks(String s) {
        int ans=0;
        
        int n=s.length();
        int i=0;
        int c=0;

        while(i<n){

           

            if(c==0){
                while(i<n&&s.charAt(i)!='|'){
                    if(s.charAt(i)=='*'){
                        ans++;
                    }
                    i++;

                }
                c=1;
                i++;

            }
            else{
                char ch=s.charAt(i);
                if(ch=='|'){
                    c=0;
                }
                i++;


            }





        }

        return ans;

    }
}