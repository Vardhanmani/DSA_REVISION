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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //base case
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;


        }
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        ListNode list1=l1;
        ListNode list2=l2;
        int carry=0;

        while(list1!=null || list2!=null){
             int val1=(list1!=null)? list1.val:0;
              int val2=(list2!=null)? list2.val:0;
              int sum=val1+val2+carry;

              int d=sum%10;
              carry=sum/10;
              ListNode temp=new ListNode(d);
              dummy.next=temp;
              dummy=dummy.next;
            
            // Update current1 & current2 to move to the next node
         list1=list1!=null ?list1.next : null;
         list2=list2!=null ?list2.next : null;
        }
        if(carry>0){
            ListNode temp=new ListNode(carry);
            dummy.next=temp;
            //dummy=dummy.next;
        }
        return ans.next;
    }
}