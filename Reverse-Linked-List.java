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
12    
13    public ListNode reverseList(ListNode head) {
14        if(head==null){
15            return head;
16        }
17        if(head.next==null){
18            return head;
19        }
20        ListNode n_h=reverseList(head.next);
21        head.next.next=head;
22        head.next=null;
23
24        return n_h;
25        
26    }
27}