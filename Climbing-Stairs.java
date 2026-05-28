1class Solution {
2    public int climbStairs(int n) {
3        
4       
5        int s1=1;
6        int s2=1;
7        int cur=1;
8
9        for(int i=2;i<=n;i++){
10            cur=s1+s2;
11            
12            s2=s1;
13            s1=cur;
14        }
15        return cur;
16       
17    }
18}