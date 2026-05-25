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
17    public void help(TreeNode root,List<Integer> ans){
18        if(root==null){
19            return;
20        }
21        help(root.left,ans);//lrft
22        ans.add(root.val);//middler
23        help(root.right,ans);
24
25
26
27
28    }
29
30    public List<Integer> inorderTraversal(TreeNode root) {
31        List<Integer> ans=new ArrayList<>();
32        help(root,ans);
33
34
35
36        return ans;
37        
38        
39    }
40    
41}