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
11class Solution {
12    public ListNode rev(ListNode head){
13        if(head==null){
14            return null;
15        }
16        if(head.next==null){
17            return head;
18        }
19        ListNode newh=rev(head.next);
20        head.next.next=head;
21        head.next=null;
22
23
24        return newh;
25    }
26    public int pairSum(ListNode head) {
27        if(head==null){
28            return 0;
29        }
30        if(head.next.next==null){
31            return head.val+head.next.val;
32        }
33
34        ListNode f=head;
35        ListNode s=head;
36
37        while(f.next.next!=null){
38            f=f.next.next;
39            s=s.next;
40
41        }
42        ListNode revh=rev(s.next);
43        int ans=Integer.MIN_VALUE;
44        while(head!=s){
45            ans=Math.max(ans,head.val+revh.val);
46            head=head.next;
47            revh=revh.next;
48
49
50        }
51        ans=Math.max(ans,head.val+revh.val);
52        return ans;
53    }
54}