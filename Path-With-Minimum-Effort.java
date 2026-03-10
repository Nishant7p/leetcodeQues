1import java.util.*;
2
3class Solution {
4    public int minimumEffortPath(int[][] heights) {
5        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
6        int rows = heights.length;
7        int cols = heights[0].length;
8        
9        
10        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
11        
12       
13        int[][] distance = new int[rows][cols];
14        for (int[] row : distance) {
15            Arrays.fill(row, Integer.MAX_VALUE);
16        }
17        distance[0][0]=0;
18        pq.add(new int[]{0,0,0});
19        while(!pq.isEmpty()){
20            int[] x=pq.poll();
21            if(x[1]==rows-1&&x[2]==cols-1){
22                return x[0];
23            }
24
25            for(int[] d:dir){
26                int nr=x[1]+d[0];
27                int nc=x[2]+d[1];
28                if(nr>=0&&nr<rows&&nc>=0&&nc<cols){
29                    int n_e=Math.max(x[0],Math.abs(heights[x[1]][x[2]]-heights[nr][nc]));
30                    if(n_e<distance[nr][nc]){
31                        distance[nr][nc]=n_e;
32                    
33                        pq.add(new int[]{n_e,nr,nc});}
34                    }
35
36
37
38                }
39            }
40        
41        return -1;
42        
43    }
44}