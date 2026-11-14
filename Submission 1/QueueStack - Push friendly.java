import java.util.*;

public class QueueStackPushFriendly {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }

    public int top() {
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
        int top = q.remove();
        q.add(top);
        return top;
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}