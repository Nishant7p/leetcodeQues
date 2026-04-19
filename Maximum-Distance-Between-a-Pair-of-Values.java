1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5
6        int ans=0;
7
8        int a=0;
9        int b=0;
10        while(a<n&&b<m){
11            if(a>b){
12                b=a;
13            }
14            while(b<m&&a<=b&&nums1[a]<=nums2[b]){
15                ans=Math.max(ans,b-a);
16                //System.out.println(a);
17                //System.out.println(b);
18                b++;
19            }
20           
21            a++;
22
23
24
25        }
26
27
28
29
30        return ans;
31        
32    }
33}