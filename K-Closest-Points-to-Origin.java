1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> b[0]-a[0]);
4        for(int i=0;i<points.length;i++){
5            int[] x=new int[3];
6            x[0]=points[i][0]*points[i][0]+points[i][1]*points[i][1];
7            x[1]=points[i][0];
8            x[2]=points[i][1];
9            if(pq.size()<k){
10                pq.add(x);
11            }
12            else{
13                pq.add(x);
14                pq.remove();
15            }
16
17
18        }
19        int[][] ans=new int[k][2];
20        for(int i=0;i<k;i++){
21            int[] x=pq.remove();
22            ans[i][0]=x[1];
23            ans[i][1]=x[2];
24        }
25        return ans;
26        
27
28    }
29}
30