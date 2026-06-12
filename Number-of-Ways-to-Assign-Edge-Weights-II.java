1class Solution {
2    int[][] up;
3    int LOG=18;
4   public int lca(int a,int b,int[] par,int[] dep){
5
6    if(dep[a]<dep[b]){
7        int t=a;
8        a=b;
9        b=t;
10    }
11
12    int d=dep[a]-dep[b];
13
14    for(int j=0;j<LOG;j++){
15        if((d&(1<<j))!=0){
16            a=up[a][j];
17        }
18    }
19
20    if(a==b){
21        return a;
22    }
23
24    for(int j=LOG-1;j>=0;j--){
25        if(up[a][j]!=up[b][j]){
26            a=up[a][j];
27            b=up[b][j];
28        }
29    }
30
31    return par[a];
32}
33     public int dfss(ArrayList<ArrayList<Integer>> adj,int[] vis,int u,int[] depth,int[] par){
34        vis[u]=1;
35        int max=0;
36        for(int v:adj.get(u)){
37            if(vis[v]==0){
38                par[v]=u;
39                depth[v]=depth[u]+1;
40               max=Math.max(max,dfss(adj,vis,v,depth,par));
41               
42            }
43        }
44        return max+1;
45
46    }
47    public int dfs(ArrayList<ArrayList<Integer>> adj,int[] vis,int u,int des){
48        vis[u]=1;
49        if(u==des){
50            return 0;
51        }
52        for(int v:adj.get(u)){
53            if(vis[v]==0){
54                int ans=dfs(adj,vis,v,des);
55                if(ans!=-1){
56                    return ans+1;
57                }
58            }
59        }
60        return -1;
61
62    }
63    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
64        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
65        int n_e=edges.length;
66        int n=n_e+1;
67        for(int i=0;i<=n;i++){
68            adj.add(new ArrayList<>());
69        }
70        for(int[] e:edges){
71            adj.get(e[0]).add(e[1]);
72            adj.get(e[1]).add(e[0]);
73
74
75        }
76        long mod=1000000007L;
77
78    long[] pow=new long[n+1];
79
80    pow[0]=1;
81
82    for(int i=1;i<=n;i++){
83        pow[i]=(pow[i-1]*2)%mod;
84    }
85       
86        
87    
88         int[] ans=new int[queries.length];
89         int[] par=new int[n+1];
90         par[1]=1;
91          int[] vis=new int[n+1];
92         int[] depth=new int[n+1];
93         int max_d=dfss(adj,vis,1,depth,par);
94         LOG=1;
95
96while((1<<LOG)<=n){
97    LOG++;
98}
99
100up=new int[n+1][LOG];
101
102for(int i=1;i<=n;i++){
103    up[i][0]=par[i];
104}
105
106for(int j=1;j<LOG;j++){
107    for(int i=1;i<=n;i++){
108        up[i][j]=up[up[i][j-1]][j-1];
109    }
110}
111         // System.out.println(lca(4,5,par,depth));
112
113
114        int i=0;
115         for(int[] q:queries){
116            
117             int s=q[0];
118             int d=q[1];
119             if(depth[s] < depth[d]){
120                int temp=s;
121                s=d;
122                d=temp;
123                }
124             int y=lca(s,d,par,depth);
125             int x=depth[s]+depth[d]-2*depth[y];
126      
127             if(x==0){
128                ans[i]=0;
129                }
130                else{
131                    int odd_s=(int)pow[x-1];
132                    ans[i]=odd_s;
133                }
134             i++;
135           
136
137
138         }
139       
140        return ans;
141        
142    }
143}