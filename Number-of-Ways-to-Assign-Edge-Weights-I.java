1class Solution {
2    public int dfs(int u,ArrayList<ArrayList<Integer>> adj,int[] vis){
3        int max=0;
4        vis[u]=1;
5        for(int v:adj.get(u)){
6            if(vis[v]==0){
7                max=Math.max(dfs(v,adj,vis),max);
8            }
9        }
10        return max+1;
11
12    }
13    public int assignEdgeWeights(int[][] edges) {
14        //In tree number of vertex(n)==number of edges+1
15        int n=edges.length+1;
16        
17        ArrayList<ArrayList<Integer>> adj_list=new ArrayList<>();
18        for(int i=0;i<=n;i++){
19            //<= n because of 1 based indexing
20            adj_list.add(new ArrayList<>());
21
22        }
23        int[] vis=new int[n+1];
24
25        for(int[] edge:edges){
26            // undirected so : u--v means u->v and v->u
27            adj_list.get(edge[0]).add(edge[1]);
28            adj_list.get(edge[1]).add(edge[0]);
29        }
30        // this will return max_depth possible starting from source=1
31        int max_depth=dfs(1,adj_list,vis)-1;
32        long ans = 1;
33        long base = 2;
34        long exp = max_depth - 1;
35        long mod = 1000000007;
36
37        while(exp > 0){
38            if((exp & 1) == 1){
39                ans = (ans * base) % mod;
40            }
41            base = (base * base) % mod;
42            exp >>= 1;
43        }
44
45        return (int)ans;
46
47
48        
49        
50        
51    }
52}