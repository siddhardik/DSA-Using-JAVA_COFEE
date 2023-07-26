
import java.util.LinkedList;

class StackULL<T> {
    private LinkedList<T> dl; // No One Can Change the data via index
    private int topIndex; // No One Can Change the data via index

    public StackULL() {
        dl = new LinkedList<>();
        topIndex = -1;
    }

    // Calculate the size of the stack

    public int size() {
        return topIndex + 1;
    }

    // Pick the element at the top of the stack

    public T top() {
        if (topIndex == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        return dl.get(topIndex);

    }

    // Check if the stack is empty or not

    public boolean isEmpty() {

        return topIndex == -1;

    }

    // Push An Element onto the Stack

    public void push(T value) {

        topIndex++;
        dl.add(value);
    }

    public void pop() {
        if (topIndex == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        // T data= top();
        topIndex--;
        dl.removeLast(); // Remove last element
        // return data;

    }

}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackULL<Integer> st = new StackULL<>();
        st.push(18);
        st.push(290);
        st.push(38);
        System.out.println("Size of Stack = " + st.size());
        System.out.println("Top Element = " + st.top());
        st.pop();
        System.out.println("Size of Stack = " + st.size());
        st.pop();
        System.out.println("Top Element = " + st.top());
        st.pop();

    }
}
