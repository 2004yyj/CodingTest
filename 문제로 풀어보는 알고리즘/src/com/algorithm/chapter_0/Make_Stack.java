package com.algorithm.chapter_0;

import java.util.ArrayList;

/**
 * 큐 구현하기
 */

public class Make_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.push(1));
        System.out.println(stack);
        System.out.println(stack.push(2));
        System.out.println(stack);
        System.out.println(stack.push(3));
        System.out.println(stack);
        System.out.println(stack.push(4));
        System.out.println(stack);
        System.out.println(stack.push(5));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}


class Stack<E> {
    private int head = 0;
    private ArrayList<E> arrayList = new ArrayList<>();

    public E push(E element) {
        head++;
        arrayList.add(element);
        return element;
    }

    public E pop() {
        if (head-- <= 0) head = 0;

        try {
            return arrayList.remove(head);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder item;
        if (head != 0) {
            item = new StringBuilder("[");
            for (int i = 0; i < head - 1; i++) {
                item.append(arrayList.get(i)).append(", ");
            }
            item.append(arrayList.get(head - 1)).append("]");
        } else {
            item = new StringBuilder("[]");
        }
        return item.toString();
    }

}