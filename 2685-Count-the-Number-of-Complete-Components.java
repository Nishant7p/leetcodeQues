class Solution { 

    public void dfs(int u,int[] vis,ArrayList<ArrayList<Integer>> adj,int j){
        vis[u]=j;
        for(int v:adj.get(u)){
            if(vis[v]==0){
                dfs(v,vis,adj,j);
            }

        }
    } 
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);


        }


        int[] vis=new int[n];
        int k=1;


        for(int i=0;i<n;i++){

            if(vis[i]==0){
                dfs(i,vis,adj,k);
                k=k+1;
            }

        }
        
        int x=0;
        int ans1=0;
        for(int i=0;i<n;i++){
            x=Math.max(x,vis[i]);

        }
         System.out.println(x);

        

        for(int i=1;i<=x;i++){
            int c=0;
            int ans=0;
            for(int j=0;j<n;j++){
                if(vis[j]==i){
                    c++;

                }
            }
             System.out.println(c);
            for(int j=0;j<n;j++){
                if(vis[j]==i){
                    
                    if(adj.get(j).size()==(c-1)){
                        ans++;
                    }
                }
            }
            if(ans==c){
                ans1++;
            }
        }



        return ans1;
        
    }
}