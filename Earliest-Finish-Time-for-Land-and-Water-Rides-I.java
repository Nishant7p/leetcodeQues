1class Solution {
2    public int earliestFinishTime(int[] landS, int[] landD, int[] waterS, int[] waterD) {
3        int n=landS.length;
4        int m=waterS.length;
5        int ans=Integer.MAX_VALUE;
6
7        for(int i=0;i<n;i++){
8            int s_l=landS[i];
9            int d_l=landD[i];
10
11            for(int j=0;j<m;j++){
12                int s_w=waterS[j];
13                int d_w=waterD[j];
14
15                int x=s_l+d_l;
16                int s_w1=Math.max(s_w,x);
17                int f1=s_w1+d_w;
18
19
20                int y=s_w+d_w;
21                int s_l1=Math.max(s_l,y);
22                int f2=s_l1+d_l;
23
24                ans=Math.min(ans,Math.min(f1,f2));
25
26
27            }
28        }
29
30
31
32
33
34
35
36
37
38        return ans;
39
40        
41    }
42}