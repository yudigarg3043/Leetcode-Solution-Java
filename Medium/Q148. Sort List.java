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
    public ListNode sortList(ListNode head) {
        int count=0,i=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        while(temp!=null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        for(int a: arr){
            temp.val = a;
            temp = temp.next;
        }
        return head;
    }
}