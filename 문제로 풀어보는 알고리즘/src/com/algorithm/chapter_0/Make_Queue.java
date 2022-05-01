package com.algorithm.chapter_0;

import java.util.ArrayList;

/**
 * 큐 구현하기
 */

public class Make_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue.enqueue(10));
        System.out.println(queue);
        System.out.println(queue.enqueue(20));
        System.out.println(queue);
        System.out.println(queue.enqueue(30));
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}


class Queue<E> {
    private int head = 0;
    private int tail = -1;
    private ArrayList<E> arrayList = new ArrayList<>();

    public E peek() {
        try {
            return arrayList.get(head);
        } catch (Exception e) {
            return null;
        }
    }

    public E enqueue(E element) {
        arrayList.add(element);
        tail++;
        return element;
    }

    public E dequeue() {
        return arrayList.get(head++);
    }

    @Override
    public String toString() {
        StringBuilder item = new StringBuilder("[");
        for (int i = head; i < arrayList.size() - 1; i++) {
            item.append(arrayList.get(i)).append(", ");
        }
        item.append(arrayList.get(arrayList.size() - 1)).append("]");
        return item.toString();
    }
}