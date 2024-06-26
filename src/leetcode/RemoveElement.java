package leetcode;

public class RemoveElement {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr!= null){
            if (curr.val == val){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                prev = curr;
                curr=curr.next;
            }
        }
        if (head.val==val) return head.next;
        return head;
    }
}
