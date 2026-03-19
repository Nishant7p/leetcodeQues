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
17    public int sum(TreeNode root,long targetSum){
18         
19        if(root==null){
20            return 0;
21        }
22        int count=0;
23        if(root.val==targetSum){
24            count=1;
25        }
26        
27        return count+sum(root.left,targetSum-root.val)+sum(root.  right,targetSum-root.val);
28
29    }
30
31    public int pathSum(TreeNode root, int targetSum) {
32        if(root==null){
33            return 0;
34
35        }
36       return sum(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
37        
38    }
39}