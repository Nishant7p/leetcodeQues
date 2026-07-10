class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;

        for(int i=0;i<n;i++){
            int s_r=i;
            int s_c=0;
            ArrayList<Integer> arr=new ArrayList<>();
            while(s_r<n&&s_c<n){
                arr.add(grid[s_r][s_c]);
                
                s_r++;
                s_c++;
                
            }
           arr.sort(Comparator.reverseOrder());
            s_r=i;
            s_c=0;
             while(s_r<n&&s_c<n){
               grid[s_r][s_c]=arr.get(s_c);
                
                s_r++;
                s_c++;
                
            }


           
           
            
        }

        for(int i=1;i<n;i++){
            int s_r=0;
            int s_c=i;
            ArrayList<Integer> arr=new ArrayList<>();
            while(s_r<n&&s_c<n){
                arr.add(grid[s_r][s_c]);
                
                s_r++;
                s_c++;
                
            }
          Collections.sort(arr);
            s_r=0;
            s_c=i;
             while(s_r<n&&s_c<n){
               grid[s_r][s_c]=arr.get(s_r);
                
                s_r++;
                s_c++;
                
            }


           
           
            
        }










        return grid;
        
    }
}