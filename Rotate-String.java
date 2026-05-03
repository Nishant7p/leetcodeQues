1class Solution {
2    public String Shift(String s){
3        StringBuilder sb=new StringBuilder();
4        for(int i=1;i<s.length();i++){
5            sb.append(s.charAt(i));
6        }
7        sb.append(s.charAt(0));
8
9        return sb.toString();
10    }
11    public boolean rotateString(String s, String goal) {
12        for(int i=0;i<s.length();i++){
13            s=Shift(s);
14            if(s.equals(goal)){
15                return true;
16            }
17            
18
19        }
20        return false;
21
22
23        
24
25    }
26}