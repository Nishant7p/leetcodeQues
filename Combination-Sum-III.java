1class Solution {
2    public void helper(List<List<Integer>> ans,int step,int c_sum,int k,int n,List<Integer> curr,int start){
3        if(k==step&&c_sum==n){
4            ans.add(new ArrayList<>(curr));
5            return;
6        }
7        if(k==step&&c_sum!=n){
8            return;
9        }
10        if(k<step){
11            return;
12        }
13        for(int i=start;i<=9;i++){
14            curr.add(i);
15            helper(ans,step+1,c_sum+i,k,n,curr,i+1);
16            curr.removeLast();
17
18        }
19
20
21
22
23
24    }
25    public List<List<Integer>> combinationSum3(int k, int n) {
26        List<List<Integer>> ans=new ArrayList<>();
27        List<Integer> cur=new ArrayList<>();
28        helper(ans,0,0,k,n,cur,1);
29        return ans;
30        
31    }
32}