package linkedlist;


import org.w3c.dom.Node;

public class LL {

     Node head;
    Node tail;
    int size;

    public LL(){
        this.size = 0;
    }

        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail == null){
                tail = head;
            }
            size += 1;
                }

        public  void insertLast(int val){
            if(tail == null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;

        }

        public void insert(int val, int index){
            if(index == 0){
                insertFirst(val);
            }
            if(index == size){
                insertLast(val);
            }

            Node temp = head;
            for (int i = 1; i < index; i++) {
                    temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
        public void insertRec(int val, int index){
            head = insertRec(val, index, head);
        }

        private Node insertRec(int val, int index, Node node){
            if(index == 0){
                Node temp = new Node(val,node);
                size++;
                return temp;
            }
            node.next = insertRec(val, index-1, node.next);
            return node;
        }

        public Node get(int index){
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }

        public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return val;
        }

        public int deleteLast(){
            if(size <= 1) return deleteFirst();
            Node secondLast = get(size - 2);
            int val = tail.data;
            tail = secondLast;
            tail.next = null;
            return val;
        }

        public int delete(int index){
            if(index == 0) return deleteFirst();
            if(index == size -1 ) return deleteLast();
            Node prev = get(index - 1);
            int val = prev.next.data;
            prev.next = prev.next.next;
            return val;
        }

          public void display(){
        Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
          }

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


}
