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
17    public TreeNode helper(int s, int e,int[] nums){
18        if(s>e){
19            return null;
20        }
21        int mid=s+(e-s)/2;
22
23        TreeNode root=new TreeNode(nums[mid]);
24        root.left=helper(s,mid-1,nums);
25        root.right=helper(mid+1,e,nums);
26
27
28        return root;
29
30
31
32    }
33    public TreeNode sortedArrayToBST(int[] nums) {
34         return helper(0,nums.length-1,nums);
35        
36    }
37}