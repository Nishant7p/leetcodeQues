1class Solution {
2    public int[][] merge(int[][] intervals) {
3        
4        
5        if(intervals.length<=1){
6            return intervals;
7        }
8        List<int[]>res=new ArrayList<>();
9        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
10        int s=intervals[0][0];
11        int e=intervals[0][1];
12        
13        for(int i=1;i<intervals.length;i++){
14            if(intervals[i][0]<=e){
15                e=Math.max(e,intervals[i][1]);
16            }else{
17                res.add(new int[]{s,e});
18                s=intervals[i][0];
19                e=intervals[i][1];
20            }
21
22        }
23        res.add(new int[]{s,e});
24        return res.toArray(new int[res.size()][]);
25        
26    }
27}