1class Solution {
2    public int maximumSafenessFactor(List<List<Integer>> grid) {
3        int ans=0;
4        int n=grid.size();
5        if(grid.get(0).get(0)==1||grid.get(n-1).get(n-1)==1){
6            return 0;
7        }
8        Queue<int[]> q=new LinkedList<>();
9        for(int i=0;i<n;i++){
10            for(int j=0;j<n;j++){
11                if(grid.get(i).get(j)==1){
12                    q.add(new int[]{i,j});
13                }
14            }
15        }
16        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
17
18        while(!q.isEmpty()){
19            int[] node=q.poll();
20            int i=node[0];
21            int j=node[1];
22
23            int v=grid.get(i).get(j);
24            for(int[] d:dir){
25                int x=i+d[0];
26                int y=j+d[1];
27
28                if(Math.min(x,y)>=0&&Math.max(x,y)<n&&grid.get(x).get(y)==0){
29                   grid.get(x).set(y, v + 1);
30                    q.add(new int[]{x,y});
31                }
32            }
33        }
34        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
35
36        pq.add(new int[]{grid.get(0).get(0), 0, 0});
37grid.get(0).set(0, -grid.get(0).get(0));
38        while(!pq.isEmpty()){
39            int[] node=pq.poll();
40            int sf=node[0];
41            int i=node[1];
42            int j=node[2];
43
44            if(i==n-1&&j==n-1){
45                return sf-1;
46            }
47             for(int[] d:dir){
48                int x=i+d[0];
49                int y=j+d[1];
50
51               if(Math.min(x,y)>=0 && Math.max(x,y)<n && grid.get(x).get(y)>0){
52    pq.add(new int[]{Math.min(sf, grid.get(x).get(y)), x, y});
53    grid.get(x).set(y, -grid.get(x).get(y));
54}
55            }
56
57        }
58
59
60
61
62
63
64
65
66        return grid.get(n-1).get(n-1)-1;
67        
68    }
69}