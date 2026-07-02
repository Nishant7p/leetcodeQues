1class Solution {
2    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
3        int m=grid.size();
4        int n=grid.get(0).size();
5        int[][] dist=new int[m][n];
6
7        for(int[] r:dist){
8            Arrays.fill(r,Integer.MAX_VALUE);
9        }
10        Deque<int[]> dq=new ArrayDeque<>();
11
12        dist[0][0]=grid.get(0).get(0);
13        dq.offerFirst(new int[]{0,0});
14
15        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
16        while(!dq.isEmpty()){
17            int[] curr=dq.pollFirst();
18            int x=curr[0];
19            int y=curr[1];
20
21            if(x==m-1&&y==n-1){
22                return dist[x][y]<health;
23            }
24
25            for(int[] d:dir){
26                int nx=d[0]+x;
27                int ny=y+d[1];
28                if(nx<0||ny<0||nx>=m||ny>=n){
29                    continue;
30                }
31                int w=grid.get(nx).get(ny);
32
33                if(dist[x][y]+w<dist[nx][ny]){
34                    dist[nx][ny]=dist[x][y]+w;
35                    if(w==0){
36                        dq.offerFirst(new int[]{nx,ny});
37                    }
38                    else{
39                        dq.offerLast(new int[]{nx,ny});
40
41                    }
42
43
44                }
45            }
46
47
48
49
50        }
51        return dist[m-1][n-1]<health;
52    }
53}