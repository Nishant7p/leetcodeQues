1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode f=head;
15        ListNode s=head;
16
17        while(f!=null&&f.next!=null&&f.next.next!=null){
18            f=f.next.next;
19            s=s.next;
20            if(f==s){
21                return true;
22            }
23
24
25
26        }
27        return false;
28
29
30
31        
32    }
33}