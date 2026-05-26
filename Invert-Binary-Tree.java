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
17    public TreeNode invertTree(TreeNode root) {
18        if(root==null){
19            return null;
20        }
21
22        Queue<TreeNode> q=new LinkedList();
23        q.add(root);
24        while(!q.isEmpty()){
25            TreeNode par=q.poll();
26            TreeNode t=par.left;
27            par.left=par.right;
28            par.right=t;
29
30
31            if(par.left!=null){
32                q.add(par.left);
33            }
34             if(par.right!=null){
35                q.add(par.right);
36            }
37
38
39
40
41        }
42        return root;
43
44
45    }
46}