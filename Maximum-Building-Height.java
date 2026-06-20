1class Solution {
2    public int maxBuilding(int n, int[][] nums) {
3        Arrays.sort(nums,(a,b)->a[0]-b[0]);
4        int len=nums.length;
5        if(len==0){
6            return n-1;
7        }
8        boolean ch=(nums[len-1][0]==n) ? true:false;
9        int m=len+1+(ch? 0:1);
10        int[][] h=new int[m][2];
11        h[0][0]=1;
12        h[0][1]=0;
13        for(int i=0;i<len;i++){
14            int dif=(nums[i][0]-h[i][0]);
15            int ht=h[i][1]+dif;
16            h[i+1][0]=nums[i][0];
17            h[i+1][1]=Math.min(ht,nums[i][1]);
18
19        }
20        if(!ch){
21            int dif=n-h[len][0];
22            int ht=h[len][1]+dif;
23            h[len+1][0]=n;
24            h[len+1][1]=Math.min(ht,n-1);
25        }
26
27        for(int i=m-2;i>=0;i--){
28            int dif=(h[i+1][0]-h[i][0]);
29            int ht=h[i+1][1]+dif;
30           
31            h[i][1]=Math.min(ht,h[i][1]);
32
33        }
34        int ans=0;
35        for(int i=1;i<m;i++){
36            int l=h[i-1][0];
37            int r=h[i][0];
38            int h1=h[i-1][1];
39            int h2=h[i][1];
40            int max=(r-l-Math.abs(h1-h2))/2+Math.max(h1,h2);
41            ans=Math.max(ans,max);
42        }
43
44
45
46
47
48
49
50        return ans;
51
52
53    }
54}