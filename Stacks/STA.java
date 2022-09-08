package Stacks;

import java.util.Arrays;

class Stack{
    private int[] arr;
    private int top ;
    private int capacity;


    public Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void  push(int x){
        if(isFull()){
            System.out.println("Overflow");
        }
        arr[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("empty stack");
        }
        return arr[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }
    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
}