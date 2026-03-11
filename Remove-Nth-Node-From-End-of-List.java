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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode sl=head;
14        ListNode fast=head;
15
16
17        for(int i=0;i<n;i++){
18            fast=fast.next;
19
20        }
21        if(fast==null){
22            head=head.next;
23            return head;
24
25        }
26        while(fast.next!=null){
27            fast=fast.next;
28            sl=sl.next;
29        }
30        sl.next=sl.next.next;
31
32
33
34
35        return head;
36
37    }
38}