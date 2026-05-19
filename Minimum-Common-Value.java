1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int i=0;
6        int j=0;
7
8        while(i<n&&j<m){
9            if(nums1[i]==nums2[j]){
10                return nums1[i];
11            }
12            if(nums1[i]<nums2[j]){
13                i++;
14            }
15            else{
16                j++;
17            }
18
19        }
20        return -1;
21        
22    }
23}