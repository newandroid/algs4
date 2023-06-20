package com.css.me;

import com.css.algs4.StdIn;
import com.css.algs4.StdOut;

public class CssStack<Item> {
    public static void main(String[] args) {
        System.out.println("start");
        CssStack<String> stack = new CssStack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                StdOut.print(stack.pop() + " ");
            }
        }
        StdOut.println("(" + stack.size + " left on stack)");
    }

    private Node first;
    private int size = 0;

    private Item pop() {
        Item srcContent = first.item;
        Node next = first.next;
        first = next;
        size--;
        return srcContent;
    }

    private void push(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        Item item;
        Node next;
    }
}
