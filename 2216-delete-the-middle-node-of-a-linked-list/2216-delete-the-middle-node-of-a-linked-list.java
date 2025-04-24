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
    public ListNode deleteMiddle(ListNode head) {
        int size=1;
        ListNode tptr=head,prev=head,curr=head;
        if(head.next==null) return null;

        while(tptr.next!=null){
            tptr=tptr.next;
            size++;
        }

        for(int i=0;i<size/2;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;
    }
}