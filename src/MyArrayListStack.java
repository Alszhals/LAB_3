import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack {
private int arr[];
private int top;
private int capacity;
MyArrayListStack(int size){
    arr=new int[size];
    capacity=size;
    top=-1;
}
public boolean isFull(){
    return top ==capacity-1;
}
    public boolean isEmpty() {
        return top == -1;
    }
    public int size(){
    return top+1;
    }
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }

        return -1;
    }
public void push(int x){
    if (isFull()){
        System.out.println("Overflow\nProgram Terminated\n");
        System.exit(-1);
    }

    System.out.println("Inserting " + x);
    arr[++top] = x;
    }
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
}
