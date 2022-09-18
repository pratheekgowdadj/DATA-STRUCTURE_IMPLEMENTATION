package linkedlist;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();

        list.insert(1,1);
        list.insert(2,2);
        list.insert(3,3);
        list.insert(4,4);
        //reverseList(list.head);

        System.out.print(reverseList(list.head));


    }

    static LL.Node reverseList(LL.Node head){
        if(head == null || head.next == null)
            return head;

        LL.Node root = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return root;

    }

}
