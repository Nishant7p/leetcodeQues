1class Solution {
2    public long countMajoritySubarrays(int[] nums, int target) {
3        int n=nums.length;
4        long ans=0;
5        for(int i=0;i<n;i++){
6            if(nums[i]==target){
7                nums[i]=1;
8            }
9            else{
10                nums[i]=-1;
11            }
12        }
13        int[] pre=new int[n];
14        pre[0]=nums[0];
15        for(int i=1;i<n;i++){
16            pre[i]=pre[i-1]+nums[i];
17
18        }
19        int s=n;
20        int[] freq=new int[2*n+1];
21
22        freq[s]=1;
23        long valid=0;
24        int lastS=0;
25
26        for(int i=0;i<n;i++){
27            if(pre[i]>lastS){
28                valid+=freq[lastS+s];
29            }
30            else{
31                valid-= freq[pre[i]+s];
32            }
33
34            ans=ans+valid;
35            freq[pre[i]+s]++;
36            lastS=pre[i];
37        }
38
39
40
41
42
43        return ans;
44        
45    }
46}