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
        ListNode dummy=head;
        int prev=dummy.val;
        dummy=dummy.next;
        int ind=1;

        int firstLocal=0;
        int prevLocal=0;
        int lastLocal=0,minDistance=Integer.MAX_VALUE;

        while(dummy.next!=null){
            int curr=dummy.val;
            if((prev<curr && curr>dummy.next.val)|| (prev>curr && curr<dummy.next.val)){
                prevLocal=lastLocal;
                lastLocal=ind;
                if(prevLocal!=0 && lastLocal!=0){
                    minDistance=Math.min(minDistance,lastLocal-prevLocal);
                }
            }

            if(firstLocal==0){
                firstLocal=lastLocal;
            }

            prev=dummy.val;
            dummy=dummy.next;
            ind++;
        }
        if(minDistance==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{minDistance,lastLocal-firstLocal};
    }
}