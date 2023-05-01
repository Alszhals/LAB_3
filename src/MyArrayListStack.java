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
public void push(int x){
    if (isFull()){
        System.out.println("Overflow\nProgram Terminated\n");
        System.exit(-1);
    }

    System.out.println("Inserting " + x);
    arr[++top] = x;
    }
}
