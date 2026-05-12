1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3
4        int min_s=Integer.MAX_VALUE;
5        String shortest="";
6        for(String s:strs){
7            if(min_s>s.length()){
8                min_s=s.length();
9                shortest=s;
10
11            }
12            
13        }
14        StringBuilder str=new StringBuilder();
15        int i=0;
16        boolean breaks =true;
17        while(i<min_s&&breaks){
18            for(String s:strs){
19                if(s.charAt(i)!=shortest.charAt(i)){
20                     breaks=false;
21                    
22                    
23                   
24
25                }
26                
27            }
28            if(breaks){
29                 str.append(shortest.charAt(i));
30            i++;
31
32            }
33            
34        }
35        return str.toString();
36        
37    }
38}