package part_08;
/*
Complete question 10 in the self-test for chapter 9.
In question 3 of the Chapter 6 Self Test, you created a Stack class.
Add custom exceptions to your class that report stack full and stack empty conditions.
*/

class test{
    public static void main(String[] args) {
        Stack testStack = new Stack(10);
        try {
            for (int i = 65; i < 77; i++) {
                testStack.push((char)i);
                System.out.println(i);
            }
        } catch (StackFull e){
            System.out.println(e.toString());
        }
        finally {
            try{
                for (int i = 0; i < 12 ; i++) {
                    System.out.println(testStack.pop());
                }
            } catch (StackEmpty e){
                System.out.println(e.toString());
            }
        }

    }
}



class Stack {

    private char [] stack;
    public int  control;

    public Stack(int sizeStack) {
        this.stack = new char[sizeStack];
    }

    public char pop() throws StackEmpty{
        if (control == stack.length){
            control--;
        }
        if (control < 0 ){
            throw new StackEmpty();
        }
        return stack[control--];
    }

    void push(char a) throws StackFull{
        if (control == stack.length){
            throw new StackFull(stack.length);
        }
        stack[control++] = a;

    }

}

class StackFull extends Exception{
    int size;

    public StackFull(int s){
        size = s;
    }

    @Override
    public String toString() {
        return "The Stack full size is" + size ;
    }
}

class StackEmpty extends Exception{

    @Override
    public String toString() {
        return "The Stack is empty";
    }
}