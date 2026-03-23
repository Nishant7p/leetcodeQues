1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int ans=0;
4        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
5        int e=intervals[0][1];
6        for(int i=1;i<intervals.length;i++){
7            if(e>intervals[i][0]){
8                ans++;
9            }else{
10                e=intervals[i][1];
11            }
12        }
13
14    return ans;
15        
16    }
17}