1class Solution {
2    public long minEnergy(int n, int brightness, int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
4        long t=0;
5
6        int s=intervals[0][0];
7        int e=intervals[0][1];
8        for(int i=0;i<intervals.length;i++){
9            int ns=intervals[i][0];
10            int ne=intervals[i][1];
11            if(ns<=e+1){
12                e=Math.max(ne,e);
13            }
14            else{
15                t=t+(long)(e-s+1);
16                s=ns;
17                e=ne;
18            }
19        }
20         t=t+(long)(e-s+1);
21        long b=(brightness+2)/3;
22        return t*b;
23        
24        
25    }
26}