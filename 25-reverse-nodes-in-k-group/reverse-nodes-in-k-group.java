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
    public ListNode reverseKGroup(ListNode head, int k) {
        //check if there k nodes are there
        ListNode cursor = head;
        int count = 0;
        while(cursor != null && count < k){
            cursor = cursor.next;
            count++;
        }
        //base case
        if(count < k){
            return head;
        }
        //revers K nodes
        ListNode prev = null;
        ListNode curr = head;
        for(int  i=0; i<k; i++){
            ListNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        //Recursion step
        head.next = reverseKGroup(curr , k);
        
        return prev;
    }
}