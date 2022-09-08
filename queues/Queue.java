package queues;

public class Queue {
    int size = 5;
    int front, rear;
    int[] items = new int[size];

    public Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        if(front == 0 && rear == size -1) return true;
        return false;
    }

    boolean isEmpty(){
        if(front == -1) return true;
        else return false;
    }

    void enQueue(int element){
        if(isFull()) System.out.print("Queue is full");
        else{
            if(front == -1) front = 0;
            rear = (rear + 1) % size;
            items[rear] = element;
        }
    }
    int deQueue(){
        int element;
        if(isEmpty()) {
            System.out.print("Queue is empty");
            return -1;
        }
        else {
            element = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else front = (front + 1 ) % size;
            return element;
        }
    }

    void display(){
        int i;
        if(isEmpty()) System.out.print("Empty queue");
        else{
            for( i = front; i != rear; i = (i + 1 ) % size)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
        }
    }

}
