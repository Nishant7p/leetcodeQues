class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        List<Integer> lis=new ArrayList<>();
       

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                lis.add(grid[i][j]);


            }

        }
        List<Integer> lis1=new ArrayList<>();
        k=k%lis.size();
        for(int i=0;i<k;i++){
            lis1.add(lis.get(lis.size()-k+i));
        }
        for(int i=0;i<lis.size()-k;i++){
            lis1.add(lis.get(i));
        }
        System.out.println(lis1);
        int x=0;
        for(int i=0;i<m;i++){
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<n;j++){
                r.add(lis1.get(x));
                x++;


            }
            ans.add(r);

        }



        return ans;
        
    }
}