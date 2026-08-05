class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }
        int[] inD=new int[n];
         int[] ch=new int[n];
         ch[k]=1;
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            inD[edges[i][1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(k);
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:adj.get(u)){
                inD[v]--;
                if(ch[v]==0){
                    ch[v]=1;
                    
                    q.add(v);
                }
            }
           







        }
         List<Integer> ans=new ArrayList<>();
         int check=1;
         for(int i=0;i<n;i++){
            if(ch[i]==1&&inD[i]>0){
                check=0;
                break;
            }
            else if(ch[i]==0){
                ans.add(i);
            }
         }
         if(check==0){
            List<Integer> x=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                x.add(i);
                
            }
            return x;

         }
         return ans;

        
    }
}