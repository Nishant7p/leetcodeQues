class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] ans=new boolean[queries.length];
        int[] grp=new int[n];
        int c=0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                c++;


            }
            grp[i]=c;

        }
        for(int i=0;i<queries.length;i++){
            if(grp[queries[i][0]]==grp[queries[i][1]]){
                ans[i]=true;

            }
            else{
                ans[i]=false;
            }
        }


        return ans;
        
    }
}