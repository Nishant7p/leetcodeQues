1class Solution {
2
3    class DS{
4        int[] parent;
5        int[] rank;
6        public DS(int n){
7            parent=new int[n+1];
8            rank=new int[n+1];
9            for(int i=1;i<=n;i++){
10                parent[i]=i;
11                rank[i]=0;
12
13            }
14        }
15        public int f_par(int u){
16            if(parent[u]==u){
17                return u;
18            }
19            parent[u]=f_par(parent[u]);
20            return parent[u];
21        }
22        public int union(int u,int v){
23            int paru=f_par(u);
24            int parv=f_par(v);
25            if(paru==parv){
26                return 0;
27            }
28            if(rank[paru]<rank[parv]){
29                parent[paru]=parv;
30
31            }
32            else if(rank[parv]<rank[paru]){
33                parent[parv]=paru;
34            }
35            else{
36                parent[parv]=paru;
37                rank[paru]++;
38            }
39            return 1;
40        }
41    }
42    public int[] findRedundantConnection(int[][] edges) {
43        int n=edges.length;
44        DS ds=new DS(n);
45        for(int[] e:edges){
46            if(ds.union(e[0],e[1])==0){
47                return new int[]{e[0],e[1]};
48            }
49            ds.union(e[0],e[1]);
50
51        }
52        return new int[0];
53
54
55        
56    }
57}
58