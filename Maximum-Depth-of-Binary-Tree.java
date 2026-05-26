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
17    
18    public int maxDepth(TreeNode root) {
19        if(root==null){
20            return 0;
21        }
22        int ans=0;
23        Queue<TreeNode> q=new LinkedList();
24        q.add(root);
25        while(!q.isEmpty()){
26            int s=q.size();
27            for(int i=0;i<s;i++){
28                TreeNode par=q.poll();
29                if(par.left!=null){
30                    q.add(par.left);
31                }
32                if(par.right!=null){
33                    q.add(par.right);
34                }
35
36            }
37            ans++;
38
39        }
40
41        return ans;
42
43      
44    }
45}