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
17    int max=0;
18    public void helper(TreeNode root,int l,int len){
19        if(root==null){
20            return;
21
22        }
23        max=Math.max(len,max);
24        if(l==1){
25            helper(root.left,0,len+1);
26             helper(root.right,1,1);
27        }
28        else{
29            helper(root.right,1,len+1);
30             helper(root.left,0,1);
31
32        }
33
34       
35    }
36    public int longestZigZag(TreeNode root) {
37        helper(root.left,0,1);
38        helper(root.right,1,1);
39        return max;
40        
41    }
42}