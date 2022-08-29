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
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
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
