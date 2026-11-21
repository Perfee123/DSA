
import java.util.*;

public class StackQueueEnqueueFriendly {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void enqueue(int x) {
        in.push(x);
    }

    public int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int front() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }
}
