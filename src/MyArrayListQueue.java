public class MyArrayListQueue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;
    MyArrayListQueue(int size){
        arr=new int[size];
        capacity=size;
        front=0;
        count=0;
        rear=-1;
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public boolean isFull() {
        return (size() == capacity);
    }
}
