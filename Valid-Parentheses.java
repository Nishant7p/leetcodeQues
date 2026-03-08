1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char c=s.charAt(i);
6            if(c=='{'||c=='['||c=='('){
7                st.push(c);
8            }
9            else{
10                if(st.isEmpty()){
11                    return false;
12                }
13                if((c==']'&&st.peek()!='[')||(c=='}'&&st.peek()!='{')||(c==')'&&st.peek()!='(')){
14                    return false;
15                }else{
16                    st.pop();
17                }
18            }
19        }
20        return st.isEmpty();
21        
22    }
23}
24