class Solution {
    public List<String> cellsInRange(String s) {
        char l_c=s.charAt(0);
        char r_c=s.charAt(3);
        char l_r=s.charAt(1);
        char r_r=s.charAt(4);
        List<String> ans=new ArrayList();
        for(char c=l_c;c<=r_c;c++){
            for(char r=l_r;r<=r_r;r++){
                ans.add(""+c+r);
            }
        }





        return ans;



        
    }
}