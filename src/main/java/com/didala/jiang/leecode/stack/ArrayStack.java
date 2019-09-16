package com.didala.jiang.leecode.stack;

/**
 * @Auther: jiangwei
 * @Date: 2019-09-11 08:19
 * @Description: 基于数组实现栈
 */
public class ArrayStack {

    private int count;
    private int n;
    private String[] items;


    public ArrayStack(int n) {
        this.items = new String[n];
        this.count =0;
        this.n = n;
    }

    public boolean push(String item) {
        if(count == n) return  false;

        items[count] = item;
        count++;
        return  true;
    }

    public String pop() {
        if(count ==0) return  null;
        count --;
        return items[count - 1];
    }


}
