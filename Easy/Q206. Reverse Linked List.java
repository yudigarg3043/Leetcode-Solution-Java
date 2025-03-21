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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int[] arr = new int[count];
        int i=0;
        while(temp!=null){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        temp=head;
        for(int j=count-1;j>=0;j--){
            temp.val=arr[j];
            temp=temp.next;
        }
        return head;
    }
}