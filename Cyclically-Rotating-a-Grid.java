1class Solution {
2    public int[] rotation(ArrayList<Integer> arr,int k){
3         int[] c_arr=new int[arr.size()];
4         k=k%arr.size();
5        for(int i=k;i<arr.size();i++){
6            c_arr[i]=arr.get(i-k);
7        }
8        for(int i=0;i<k;i++){
9            c_arr[i]=arr.get(arr.size()-k+i);
10        }
11        return c_arr;
12 
13
14    }
15    public int[][] rotateGrid(int[][] grid, int k) {
16        int m=grid.length;
17        int n=grid[0].length;
18        for(int l=0;l < Math.min(m, n) / 2;l++){
19
20        
21        ArrayList<Integer> arr=new ArrayList();
22        for(int i=l;i<m-l;i++){
23           arr.add(grid[i][l]);
24        }
25         for(int i=l+1;i<n-l;i++){
26           arr.add(grid[m-l-1][i]);
27        }
28        for(int i=m-l-2;i>=l;i--){
29           arr.add(grid[i][n-l-1]);
30        }
31         for(int i=n-l-2;i>l;i--){
32           arr.add(grid[l][i]);
33        }
34
35        int[] c_arr=rotation(arr,k);
36        int x=0;
37
38         for(int i=l;i<m-l;i++){
39           grid[i][l]=c_arr[x];
40           x++;
41        }
42         for(int i=l+1;i<n-l;i++){
43           grid[m-l-1][i]=c_arr[x];
44           x++;
45        }
46        for(int i=m-l-2;i>=l;i--){
47           grid[i][n-l-1]=c_arr[x];
48           x++;
49        }
50         for(int i=n-l-2;i>l;i--){
51           grid[l][i]=c_arr[x];
52           x++;
53        }
54        }
55
56
57        
58       
59        return grid;
60        
61    }
62}