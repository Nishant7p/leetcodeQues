1class Solution {
2    public String decodeString(String s) {
3        Stack<Character> st=new Stack();
4
5        int l=0;
6        int n=s.length();
7        while(l<n){
8            if(s.charAt(l)!=']'){
9                st.add(s.charAt(l));
10            }
11            else{
12                String str="";
13                while(st.peek()!='['){
14                    str=st.pop()+str;
15                }
16                st.pop();
17                String k="";
18                while(!st.isEmpty()&&st.peek()>='0'&&st.peek()<='9'){
19                    k=st.pop()+k;
20
21                }
22                int x=Integer.parseInt(k);
23                
24                str=str.repeat(x);
25                System.out.println(str);
26                int m=str.length();
27                for(int i=0;i<m;i++){
28                    st.add(str.charAt(i));
29                }
30
31             
32            }
33
34            l++;
35
36        }
37        StringBuilder sb=new StringBuilder();
38        while(!st.isEmpty()){
39            sb.append(st.pop());
40        }
41        sb.reverse();
42
43         System.out.println(st);
44        return sb.toString();
45        
46        
47    }
48}