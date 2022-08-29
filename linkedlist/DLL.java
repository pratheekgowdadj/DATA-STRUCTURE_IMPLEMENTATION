package linkedlist;

public class DLL {
    Node head;

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
    }


    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("list in reverse is");
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("End");
    }

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node head, Node prev) {
            this.data = data;
            this.next = head;
            this.prev = prev;
        }
    }

}
