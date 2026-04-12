1class Solution {
2    public void helper(List<String> ans,String s,StringBuilder sb,int i,String[] map){
3        if(i==s.length()){
4            ans.add(sb.toString());
5            return;
6        }
7        String x=map[s.charAt(i)-'0'];
8        for(int j=0;j<x.length();j++){
9            sb.append(x.charAt(j));
10            helper(ans,s,sb,i+1,map);
11            sb.deleteCharAt(sb.length()-1);
12        }
13       
14
15
16
17
18    }
19    public List<String> letterCombinations(String s) {
20        if(s.length() == 0) return new ArrayList<>();
21        String[] map = {
22    "", "", 
23    "abc", "def", "ghi", "jkl", 
24    "mno", "pqrs", "tuv", "wxyz"
25};
26        
27        List<String> ans=new ArrayList<>();
28        StringBuilder sb=new StringBuilder();
29        helper(ans,s,sb,0,map);
30        return ans;
31        
32    }
33}