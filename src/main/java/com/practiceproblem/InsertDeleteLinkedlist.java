package com.practiceproblem;

class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class InsertDeleteLinkedlist {
    static LinkedListNode head = null;

    public static void main(String[] args) {
        head = newNode(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);

        display();
        System.out.println();
        deleteNode(3);
        display();

    }

    private static LinkedListNode newNode(int data) {
        LinkedListNode node = new LinkedListNode(data);
        node.next = null;
        return node;
    }

    private static void insert(int data) {
        if (null == head) {
            head = newNode(data);
        }
        LinkedListNode current = head;
        LinkedListNode newNode = newNode(data);
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    private static void display() {
        if (null == head) {
            System.out.println("LinkedList is empty");
        } else {
            LinkedListNode current = head;
            System.out.println("Elements in LinkedList are");
            while (null != current) {
                System.out.print(current.data + "\t");
                current = current.next;
            }
        }

    }

    private static void deleteNode(int data) {
        LinkedListNode current = head;

        if (null != current && current.data == data) {
            head = current.next;
            return;
        }
        while (null != current.next && current.next.data != data) {
            current = current.next;
        }
        if (null == current || null == current.next) {
            return;
        }
        current.next = current.next.next;

    }

}
