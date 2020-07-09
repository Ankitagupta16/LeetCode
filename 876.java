#solution 1
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return null;
        ListNode temp=head;
        int count=0;
        while(temp !=null)
        {   count++;
            temp=temp.next;
        }
        temp=head;
        int pos=count/2;
        
        while(pos!=0)
        {
            temp=temp.next;
            pos--;
        }
        return temp;
    }
}

#solution 2

public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
