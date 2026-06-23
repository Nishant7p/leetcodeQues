1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for a binary tree node.
13 * public class TreeNode {
14 *     int val;
15 *     TreeNode left;
16 *     TreeNode right;
17 *     TreeNode() {}
18 *     TreeNode(int val) { this.val = val; }
19 *     TreeNode(int val, TreeNode left, TreeNode right) {
20 *         this.val = val;
21 *         this.left = left;
22 *         this.right = right;
23 *     }
24 * }
25 */
26class Solution {
27    public TreeNode help(int l,int r,ArrayList<Integer> arr){
28        if(l>r){
29            return null;
30        }
31        int mid=l+(r-l)/2;
32        TreeNode x=new TreeNode(arr.get(mid));
33        x.left=help(l,mid-1,arr);
34        x.right=help(mid+1,r,arr);
35        return x;
36
37
38
39
40
41
42
43    }
44    public TreeNode sortedListToBST(ListNode head) {
45        ArrayList<Integer> arr=new ArrayList<>();
46        while(head!=null){
47            arr.add(head.val);
48            head=head.next;
49        }
50        
51        System.out.println(arr);
52        return help(0,arr.size()-1,arr);
53        
54    }
55}