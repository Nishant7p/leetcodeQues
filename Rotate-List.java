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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null){
14            return head;
15        }
16        if(k==0){
17            return head;
18        }
19
20        ListNode s=head;
21        ListNode f=head;
22        int c=0;
23
24        while(s.next!=null){
25            c++;
26            s=s.next;
27
28        }
29        c++;
30        k=k%c;
31        //System.out.println(c);
32        for(int i=0;i<c-k-1;i++){
33            f=f.next;
34        }
35        System.out.println(f.val);
36        s.next=head;
37        head=f.next;
38        f.next=null;
39        
40return head;
41        
42    }
43}