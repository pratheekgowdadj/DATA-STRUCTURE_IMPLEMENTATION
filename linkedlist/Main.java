package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertFirst(121);
        list.insertLast(111);
        list.insertLast(12);
        list.insert(212,3);
        list.display();
        list.insertRec(21,2);
        list.display();

       /* DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(11);
        list.insertFirst(13);
        list.insertFirst(17);
        list.display();*/
    }
}
