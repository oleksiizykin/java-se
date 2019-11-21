package com.linkedList;

public class Node {
    Object data;
    Node next;
    Node previous;

    public Node(Node previous, Object data, Node next) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}
