1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4
5        int n=s.length();
6        int i=0;
7        while(i<n){
8            char c=s.charAt(i);
9            if(c=='('||c=='{'||c=='['){
10                st.add(c);
11            }
12            else{
13            if((c==')'&&st.size()==0)||c==')'&&st.peek()!='('){
14                return false;
15            }
16             if((c=='}'&&st.size()==0)||c=='}'&&st.peek()!='{'){
17                return false;
18            }
19             if((c==']'&&st.size()==0)||c==']'&&st.peek()!='['){
20                return false;
21            }
22            st.pop();}
23            i++;
24
25
26
27        }
28
29
30
31        if(st.isEmpty()){
32            return true;
33        }
34        else{
35            return false;
36        }
37       
38    }
39}
40