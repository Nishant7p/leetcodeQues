1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode reverseOddLevels(TreeNode root) {
18        if(root==null){
19            return null;
20        }
21       
22        
23        int level=0;
24        Queue<TreeNode> q=new LinkedList<>();
25        q.add(root);
26        while(!q.isEmpty()){
27            int s=q.size();
28            List<TreeNode> st=new ArrayList<>();
29            for(int i=0;i<s;i++){
30               TreeNode node=q.poll();
31               st.add(node);
32               if(node.left!=null){
33                q.add(node.left);
34               }
35               if(node.right!=null){
36                q.add(node.right);
37               }
38
39            }
40            if(level%2==1){
41                int l=0;
42                int r=st.size()-1;
43                while(l<r){
44                    int temp=st.get(l).val;
45                    st.get(l).val=st.get(r).val;
46                    st.get(r).val=temp;
47                    l++;
48                    r--;
49
50                }
51            }
52            level++;
53
54        }
55        return root;
56    }
57}