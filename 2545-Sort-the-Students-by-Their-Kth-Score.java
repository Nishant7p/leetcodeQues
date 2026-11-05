class Solution {
    public int[][] sortTheStudents(int[][] arr, int k) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] ans=new int[m][n];
        int[] kth=new int[m];

        HashMap<Integer,Integer> map=new HashMap();

        for(int i=0;i<m;i++){
            map.put(arr[i][k],i);
            kth[i]=arr[i][k];

        }
        Arrays.sort(kth);
        for(int i=0;i<m;i++){
            int st=map.get(kth[i]);
            for(int j=0;j<n;j++){
                ans[m-i-1][j]=arr[st][j];
            }


        }








        return ans;
        
    }
}