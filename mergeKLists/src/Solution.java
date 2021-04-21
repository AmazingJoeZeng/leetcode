import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ListNode l1=null;
        ListNode l2=null;
        ArrayList<ListNode> a=new ArrayList<>();
        a.add(l1);
        a.add(l2);
    }

    public static ListNode mergeKLists(ArrayList<ListNode> lists) {
        ListNode node=null;
        if(lists.size()==0){
            return null;
        }
        if(lists.size()==1){
            return lists.get(0);
        }
        while(lists.size()>1){
            node=mergeTwoLists(lists.get(0),lists.get(1));      //合并前两项
            lists.remove(0);
            lists.remove(1);
            lists.add(node);
        }
        return node;
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode newhead=null;
        if(list1.val<list2.val){
            newhead=list1;
            list1=list1.next;
            newhead.next=mergeTwoLists(list1,list2);
        }else{
            newhead=list2;
            list2=list2.next;
            newhead.next=mergeTwoLists(list1,list2);
        }
        return newhead;
    }
}
