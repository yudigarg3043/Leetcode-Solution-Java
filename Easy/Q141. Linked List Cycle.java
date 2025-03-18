/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;
        ListNode tempf = head;
        ListNode temps = head;
        while(tempf!=null && tempf.next!=null){
            tempf = tempf.next.next;
            temps = temps.next;
            if(temps==tempf) return true;
        }
        return false;
    }
}