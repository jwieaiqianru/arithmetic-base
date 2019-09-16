package com.didala.jiang.leecode.stack;

/**
 * @Auther: jiangwei
 * @Date: 2019-09-11 08:35
 * @Description: 链表实现栈
 */
public class LinkedStack {

    private Node top = null;


    public void push(int n) {

        Node newNode = new Node(n, null);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public  int  pop() {
        if (top == null) {
            return -1;
        } else {
            int m = top.val;
            top =top.next;
            return m;
        }
    }




    public static class Node{

        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

    }

}
