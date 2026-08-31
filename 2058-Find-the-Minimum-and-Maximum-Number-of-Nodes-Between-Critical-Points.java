/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode prev=head;
        ListNode curr=head;
        ListNode next=head;
        next=head.next;
        if(next==null){
            return ans;
        }
        next=next.next;
        curr=curr.next;

        int c=0;
        arr.add(0);
        while(curr.next!=null){
            if(next==null){
                break;
            }
            else if(prev.val>curr.val&&next.val>curr.val){
                arr.add(1);
            }
            else if(prev.val<curr.val&&next.val<curr.val){
                arr.add(1);
            }
            else{
               
                arr.add(0);

            }
             next=next.next;
            prev=prev.next;
            curr=curr.next;
            
        }
        arr.add(0);
        for(int i: arr){
            System.out.println(i);

        }
        int min=Integer.MAX_VALUE;
        int prevv=-1;
        int l=-1;
        int r=-1;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==1){
                r=i;
            }
            if(arr.get(i)==1&&prevv!=-1){
                min=Math.min(min,i-prevv);
                prevv=i;
            }
            else if(arr.get(i)==1){
                prevv=i;
                l=i;
            }

        }
        if(min!=Integer.MAX_VALUE){
            ans[0]=min;
            ans[1]=r-l;
        }



























        return ans;

        
    }
}