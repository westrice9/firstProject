package leetcode;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        System.out.println(middleNode(n1).toString());
    }
    public static ListNode middleNode(ListNode head) {
        int size=0;
        ListNode temp = head;
        while(head!=null) {
            head = head.next;
            size++;
        }
        for(int i=0; i<size/2; i++){
            temp=temp.next;
        }

        return temp;
    }
}
