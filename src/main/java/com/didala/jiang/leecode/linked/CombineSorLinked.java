package com.didala.jiang.leecode.linked;

import com.didala.jiang.geek.linkedlist_7.ListNode;

/**
 * @Auther: jiangwei
 * @Date: 2019-09-06 08:09
 * @Description:
 */
public class CombineSorLinked {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public ListNode circulation(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode soldier = new ListNode(0);

        ListNode p  = soldier;


        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            soldier.next = p;
        }
        return  soldier.next;

    }


}
