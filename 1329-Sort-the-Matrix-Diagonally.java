class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] arr=new int[n][m];


        for(int i=0;i<n;i++){
            int r=i;
            int c=0;
            List<Integer> lis=new ArrayList<>();
            while(r<n&&c<m){
                lis.add(mat[r][c]);
                    r++;
                    c++;
                

            }
            Collections.sort(lis);
            r=i;
            c=0;
            int k=0;
            while(r<n&&c<m){
                arr[r][c]=lis.get(k);
                r++;
                c++;
                k++;
                

            }


        }
        for(int j=0;j<m;j++){
            int r=0;
            int c=j;
            List<Integer> lis=new ArrayList<>();
            while(r<n&&c<m){
                lis.add(mat[r][c]);
                    r++;
                    c++;
                

            }
            Collections.sort(lis);
            r=0;
            c=j;
            int k=0;
            while(r<n&&c<m){
                arr[r][c]=lis.get(k);
                r++;
                c++;
                k++;
                

            }


        }













        return arr;

        
        
    }
}