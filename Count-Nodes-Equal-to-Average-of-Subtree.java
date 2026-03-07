1class Solution {
2
3    int c = 0;
4
5    public int[] traversal(TreeNode root){
6        if(root == null){
7            return new int[]{0,0};
8        }
9
10        int[] r = traversal(root.right);
11        int[] l = traversal(root.left);
12
13        int sum = r[0] + l[0] + root.val;
14        int count = r[1] + l[1] + 1;
15
16        if(sum / count == root.val){
17            c++;
18        }
19
20        return new int[]{sum, count};
21    }
22
23    public int averageOfSubtree(TreeNode root) {
24        traversal(root);
25        return c;
26    }
27}