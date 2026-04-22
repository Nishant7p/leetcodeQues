1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3       
4        List<String> ans=new ArrayList<>();
5        for(String q:queries){
6            for(String d:dictionary){
7                int df=0;
8                for(int i=0;i<q.length();i++){
9                    if(q.charAt(i)!=d.charAt(i)){
10                        df++;
11                    }
12                    if(df>2){
13                        break;
14                    }
15                    
16
17
18
19                }
20                if(df<=2){
21                        ans.add(q);
22                        break;
23                    }
24
25            }
26            
27        }
28
29
30
31
32        return ans;
33
34
35        
36    }
37}