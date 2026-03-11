1class Solution {
2    class DisSet{
3        int[] parent;
4        int[] rank;
5        DisSet(int n){
6            this.parent=new int[n];
7            this.rank=new int[n];
8            for(int i=0;i<n;i++){
9                parent[i]=i;
10                rank[i]=0;
11            }
12        }
13        public void union(int u,int v){
14            int p_u=f_parent(u);
15            int p_v=f_parent(v);
16            if(p_u==p_v){
17                return;
18            }
19            if(rank[p_u]<rank[p_v]){
20                parent[p_u]=p_v;
21            }
22            else if(rank[p_v]<rank[p_u]){
23                parent[p_v]=p_u;
24            }else{
25                parent[p_v]=p_u;
26                rank[p_u]++;
27            }
28
29        }
30        public int f_parent(int u){
31            if(parent[u]==u){
32                return u;
33
34            }
35            parent[u]=f_parent(parent[u]);
36            return parent[u];
37        }
38
39    }
40    class Edge{
41        int u;
42        int v;
43        int w;
44        Edge(int u,int v,int w){
45            this.u=u;
46            this.v=v;
47            this.w=w;
48        }
49
50    }
51    public int minCostConnectPoints(int[][] points) {
52        int n=points.length;
53        List<Edge> edges=new ArrayList<>();
54         for(int i=0;i<n;i++){
55            for(int j=i+1;j<n;j++){
56
57                int dist=Math.abs(points[i][0]-points[j][0])+
58                         Math.abs(points[i][1]-points[j][1]);
59
60                edges.add(new Edge(i,j,dist));
61            }
62        }
63
64        Collections.sort(edges,(a,b)->a.w-b.w);
65        int cost=0;
66
67        DisSet ds=new DisSet(n);
68        for( Edge e:edges){
69            int u=e.u;
70            int v=e.v;
71            int w=e.w;
72
73
74            if(ds.f_parent(u)!=ds.f_parent(v)){
75                cost=cost+w;
76                ds.union(u,v);
77            }
78
79
80
81        }
82
83
84
85
86
87
88
89        return cost;
90    }
91}
92