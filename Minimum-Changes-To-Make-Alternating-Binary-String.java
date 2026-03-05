1class Solution {
2    public int minOperations(String s) {
3       
4        int n=s.length();
5         char[] s1=new char[n];
6        char[] s2=new char[n];
7        for(int i=0;i<n;i++){
8            if(i%2==0){
9                s1[i]='0';
10               s2[i]='1';
11            }
12            else{
13                s1[i]='1';
14               s2[i]='0';
15
16            }
17        }
18        int a1=0;
19        int a2=0;
20        for(int i=0;i<n;i++){
21            if(s.charAt(i)!=s1[i]){
22                a1++;
23            }
24            if(s.charAt(i)!=s2[i]){
25                a2++;
26            }
27
28        }
29        return Math.min(a1,a2);
30        
31    }
32}