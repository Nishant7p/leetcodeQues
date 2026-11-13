class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int ans=0;

        HashSet<String> set=new HashSet();


        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


        for(String s:words){
            StringBuilder sb=new StringBuilder();

            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                String c_m=morse[c-'a'];
                sb.append(c_m);


            }
            set.add(sb.toString());


        }
        













        ans=set.size();


        return ans;
        
    }
}