class Solution {
    public int lengthOfLongestSubstring(String s) {

        
        int max=0;
        int l=0;
        int r=0;
         HashMap<Character,Integer> set=new HashMap<>();
        while(l<s.length()){
           
            int cur=0;
            while(r<s.length()){
                cur=r-l+1;
                if(set.containsKey(s.charAt(r))){
                    l = Math.max(l, set.get(s.charAt(r)) + 1);
                }
                    set.put(s.charAt(r),r);
                    
                cur=r-l+1;
            
            if(cur>max){
                max=cur;
            }
        r++;}
            l++;

        }









        return max;
        
    }
}
