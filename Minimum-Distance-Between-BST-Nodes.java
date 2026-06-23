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
17    int min=Integer.MAX_VALUE;
18    Integer p=null;
19    public void inO(TreeNode root){
20        if(root==null){
21            return;
22        }
23        inO(root.left);
24        if(p!=null){
25            min=Math.min(min,Math.abs(root.val-p));
26        }
27        p=root.val;
28
29        inO(root.right);
30
31    }
32    public int minDiffInBST(TreeNode root) {
33
34        inO(root);
35       
36
37
38
39    return min;
40
41        
42    }
43}