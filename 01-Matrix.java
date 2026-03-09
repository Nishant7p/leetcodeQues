1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int n=mat.length;
4        int m=mat[0].length;
5        int[][] ans=new int[n][m];
6
7        Queue<int[]> q=new LinkedList<>();
8
9        int[][] vis=new int[n][m];
10
11        for(int i=0;i<n;i++){
12            for(int j=0;j<m;j++){
13                if(mat[i][j]==0){
14                    q.add(new int[]{i,j});
15                    vis[i][j]=1;
16                }
17            }
18        }
19        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
20
21        while(!q.isEmpty()){
22            int s=q.size();
23            for(int i=0;i<s;i++){
24                int[] x=q.poll();
25                int c=x[1];
26                int r=x[0];
27                for(int[] d:dir){
28                    int nr=r+d[0];
29                    int nc=c+d[1];
30                    if(nr<n&&nr>=0&&nc<m&&nc>=0&&vis[nr][nc]!=1){
31                        vis[nr][nc]=1;
32                        q.add(new int[]{nr,nc});
33                        ans[nr][nc]=1+ans[r][c];
34                    }
35                }
36
37            }
38
39
40        }
41        
42
43
44
45
46
47
48
49        return ans;
50    }
51}