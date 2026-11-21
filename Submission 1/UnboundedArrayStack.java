
public class UnboundedArrayStack {

    int[] arr = new int[2];
    int top = -1;

    public void push(int x) {
        if (top == arr.length - 1) {
            resize(arr.length * 2);
        }
        arr[++top] = x;
    }

    public int pop() {
        int val = arr[top--];
        if (top + 1 > 0 && top + 1 <= arr.length / 4) {
            resize(arr.length / 2);
        }
        return val;
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void resize(int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
