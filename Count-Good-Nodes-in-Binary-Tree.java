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
17    int c=0;
18    public void traversal(TreeNode root,int max){
19        if(root==null){
20            return;
21        }
22        if(root.val>=max){
23            c++;
24            max=root.val;
25        }
26        traversal(root.left,max);
27        traversal(root.right,max);
28
29
30
31    }
32    public int goodNodes(TreeNode root) {
33        traversal(root,Integer.MIN_VALUE);
34        return c;
35        
36    }
37}