package com.css.me;

import com.css.algs4.StdIn;
import com.css.algs4.StdOut;

public class CssQueue<Item> {
    public static void main(String[] args) {
        System.out.println("start");
        CssQueue<String> queue = new CssQueue<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                StdOut.print(queue.dequeue() + " ");
            }
        }
        StdOut.println("(" + queue.size + " left on stack)");
    }

    private class Node {
        Item item;
        Node next;
    }

    Node first;
    Node last;
    int size;

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void enqueue(Item item) {//向表尾添加元素
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    Item dequeue() {//向表头删除元素
        Item oldItem = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        size--;
        return oldItem;
    }

}
