package Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        reverse("john cena");
    }

    static void reverse(String str){
        Stack<String> s = new Stack<>();
        String[] token = str.split(" ");

        for (int i = 0; i < token.length; i++) {
            s.push(token[i]);
        }

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
