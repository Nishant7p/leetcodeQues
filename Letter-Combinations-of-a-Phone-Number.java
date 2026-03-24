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
20        String[] map = {
21    "", "", 
22    "abc", "def", "ghi", "jkl", 
23    "mno", "pqrs", "tuv", "wxyz"
24};
25        
26        List<String> ans=new ArrayList<>();
27        StringBuilder sb=new StringBuilder();
28        helper(ans,s,sb,0,map);
29        return ans;
30        
31    }
32}