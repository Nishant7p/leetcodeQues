1class Solution {
2    public boolean checkOnesSegment(String s) {
3        if(s.length()==1){
4            return true;
5        }
6        for(int i=1;i<s.length();i++){
7            if(s.charAt(i-1)=='0'&&s.charAt(i)=='1'){
8                return false;
9            }
10
11
12        }
13        return true;
14        
15    }
16}