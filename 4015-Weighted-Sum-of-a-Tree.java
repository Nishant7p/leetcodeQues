class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        long ans=0;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=parent.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }
        for(int i=1;i<n;i++){
            adj.get(parent[i]).add(i);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        int h=0;
        int d=0;
        long curr=0;

        while(!q.isEmpty()){
            int si=q.size();
            d++;
            for(int i=0;i<si;i++){
                int u=q.poll();
                curr+=(long)nums[u]*d;
                for(int v:adj.get(u)){
                    q.add(v);
                }
            }



        }
        for(int i=0;i<n;i++){
            ans+=(long)nums[i]*(d+1);
        }
        return ans-curr;
    }
}