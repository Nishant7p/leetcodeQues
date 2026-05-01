1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> st = new Stack<>();
4
5        String[] parts = path.split("/");
6
7        for(String part : parts){
8            if(part.equals("") || part.equals(".")){
9                continue;
10            }
11            else if(part.equals("..")){
12                if(!st.isEmpty()){
13                    st.pop();
14                }
15            }
16            else{
17                st.push(part);
18            }
19        }
20
21        String ans = "";
22
23        for(String folder : st){
24            ans = ans + "/" + folder;
25        }
26
27        if(ans.length()==0){
28            return "/";
29        }
30
31        return ans;
32    }
33}