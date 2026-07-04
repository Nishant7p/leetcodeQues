class Solution {
    public class Pair{
        int node;
        int dist;
        public Pair(int node, int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public void dfs(int u,int[] vis, ArrayList<ArrayList<Pair>> adj,int[] min){
        vis[u]=1;

        for(Pair p:adj.get(u)){
            int v=p.node;
            int dist=p.dist;
            min[0]=Math.min(min[0],dist);

            if(vis[v]==0){
                
                dfs(v,vis,adj,min);

            }
        }

    }
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList());
        }
        int[] min=new int[1];
        min[0]=Integer.MAX_VALUE;
        for(int[] r:roads){
            adj.get(r[0]).add(new Pair(r[1],r[2]));
            adj.get(r[1]).add(new Pair(r[0],r[2]));
        }
        int[] vis=new int[n+1];
        dfs(1,vis,adj,min);


        return min[0];


    }
}