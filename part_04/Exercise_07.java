package part_04;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

class Exercise_07{

    public static void main(String[] args) {
        char temp = ' ';
        Stack alphabet = new Stack(27);
        for (int i = 65; i < (65+26) ; i++) {
            alphabet.push((char)i);
        }
        for (int i = 0; i < 26; i++) {
            System.out.println(alphabet.pop());
        }
    }
    
}

class Stack{
    private char [] stack;
    public int  control;

    public Stack(int sizeStack) {
        this.stack = new char[sizeStack];
    }

    char pop(){
        if (control < 0 ){
            System.out.println("Empty Stack");
            return ' ';
        }
        control--;
        return stack[control];
        
    }

    void push(char a){
        if (control == stack.length){
            System.out.println("Stack is full");
            return;
        }
        stack[control++] = a;

    }

}