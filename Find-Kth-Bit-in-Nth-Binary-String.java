1class Solution {
2    public String reverse(String s){
3       
4        StringBuilder sb=new StringBuilder();
5        for(int i=s.length()-1;i>=0;i--){
6            sb.append(s.charAt(i));
7        }
8        return sb.toString();
9
10        
11
12    }
13    public String invert(String s){
14        StringBuilder sb=new StringBuilder();
15        for(int i=0;i<s.length();i++){
16            if(s.charAt(i)=='0'){
17                sb.append('1');
18            }
19            else{
20                sb.append('0');
21            }
22        }
23        return sb.toString();
24
25    }
26    public char findKthBit(int n, int k) {
27        String x="0";
28        for(int i=1;i<n;i++){
29            x=x+"1"+reverse(invert(x));
30
31
32        }
33        return x.charAt(k-1);
34
35        
36    }
37}