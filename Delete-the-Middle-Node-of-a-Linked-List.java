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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head==null){
14            return null;
15        }
16        if(head.next==null){
17            return null;
18        }
19        ListNode f=head;
20        ListNode s=head;
21
22
23        while(f.next.next!=null&&f.next.next.next!=null){
24            f=f.next.next;
25            s=s.next;
26        }
27
28        s.next=s.next.next;
29
30
31
32        return head;
33    }
34}