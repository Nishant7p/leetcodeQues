1class Solution {
2    public int[] separateDigits(int[] nums) {
3        ArrayList<Integer> arr=new ArrayList<>();
4
5        for(int i:nums){
6            int t=i;
7            Stack<Integer> st=new Stack();
8            while(t>0){
9               st.add(t%10);
10                t=t/10;
11
12            }
13            while(!st.isEmpty()){
14                arr.add(st.pop());
15            }
16        }
17        int[] ans=new int[arr.size()];
18        for(int i=0;i<arr.size();i++){
19            ans[i]=arr.get(i);
20        }
21        return ans;
22    }
23}