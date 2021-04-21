package 链表中环的入口节点;

import java.util.List;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/20 4:48 下午
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

    }

    public static ListNode detectCycle(ListNode head) {

        if(head==null){
            return null;
        }

        ListNode meetNode=meetNode(head);
        ListNode node=head;

        if(meetNode==null){
            return null;
        }

        while(node!=meetNode){
            node=node.next;
            meetNode=meetNode.next;
        }
        return node;
    }

    public static ListNode meetNode(ListNode head){
        if(head==null){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return slow;
            }
        }
        return null;
    }


}
