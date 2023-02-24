class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class CustomLinkedList {
    Node head;
    Node tail;
    int size;

    public void addLast(int data) {
        Node tba = new Node(data); // tba.data -> 56, tba.next -> null
        if(head == null) {
            head = tba;
            tail = tba;
        } else {
            tail.next = tba;
            tail = tba;
        }
        size += 1;
    }

    public void addFirst(int data) {
        Node tba = new Node(data); // tba.data -> 56, tba.next -> null
        if(head == null) {
            head = tba;
            tail = tba;
        } else {
           tba.next = head;
           head = tba;
        }
        size += 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        if(this.size == 0) return "empty";
        while(curr != null) {
            sb.append(curr.data).append("->");
            curr = curr.next;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}