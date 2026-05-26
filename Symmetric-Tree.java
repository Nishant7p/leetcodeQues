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
17    public boolean helper(TreeNode left,TreeNode right){
18        if(left==null&&right==null){
19            return true;
20        }
21        if((left==null&&right!=null)||(left!=null&&right==null)){
22            return false;
23        }
24
25        if(left.val!=right.val){
26            return false;
27        }
28        return helper(left.left,right.right)&&helper(left.right,right.left);
29
30
31
32
33
34    }
35    public boolean isSymmetric(TreeNode root) {
36        if(root==null){
37            return true;
38        }
39        return helper(root.left,root.right);
40
41        
42    }
43    
44       
45}