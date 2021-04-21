public class ReverseList {

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);

        ListNode b=ReverseList(a);
        while(b!=null){
            System.out.print(b.val);
            b=b.next;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        ListNode newhead=null;
        ListNode node=null;
        while(head!=null){
            newhead=head;
            head=head.next;

            newhead.next=node;
            node=newhead;
        }
        return node;
    }
}
