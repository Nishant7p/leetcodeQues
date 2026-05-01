1class Solution {
2    public String countAndSay(int n) {
3        if(n==1){
4            return "1";
5        }
6        String x=countAndSay(n-1);
7        int i=0;
8        StringBuilder sb=new StringBuilder();
9        while(i<x.length()){
10            int c=1;
11            while(i+1<x.length()&&x.charAt(i)==x.charAt(i+1)){
12                c++;
13                i++;
14            }
15            sb.append(c);
16            sb.append(x.charAt(i));
17            i++;
18        }
19        return sb.toString();
20        
21    }
22}