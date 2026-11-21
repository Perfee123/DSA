
public class ArrayCircularQueue {

    int[] arr;
    int front = 0;
    int rear = -1;
    int size = 0;
    int capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public int front() {
        if (size == 0) {
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
