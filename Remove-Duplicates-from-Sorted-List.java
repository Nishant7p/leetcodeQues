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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode temp=head;
14        if(head==null||head.next==null){
15            return head;
16        }
17        while(temp!=null&&temp.next!=null){
18            while(temp.next!=null&&temp.val==temp.next.val){
19                temp.next=temp.next.next;
20            }
21            temp=temp.next;
22
23        }
24        return head;
25        
26    }
27}