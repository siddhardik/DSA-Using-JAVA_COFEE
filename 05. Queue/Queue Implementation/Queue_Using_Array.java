
// Queue using Array  ==== QuUA  , Use Dynamically Using Push Must
import java.util.Arrays;

class QuUA {
    private int data[];
    private int size;
    private int front;
    private int rear; // Front and Rear are indices

    // Constructor
    public QuUA(int capacity) {
        data = new int[capacity];
        this.size = 0;
        this.front = -1;
        this.rear = -1;
    }

    // Normal Constructor
    public QuUA() {
        this.data = new int[5];
        this.size = 0;
        this.front = -1;
        this.rear = -1;
    }

    public int totalFreeSpace() {
        return data.length - size;
    }

    public int size() {
        return size;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Insertion
    public void enqueue(int x) { // Make It Private Funtion , And Only Provide enqueMust Function to user
        data[++rear] = x;
        if (front == -1) {
            front = 0; // Front Will be updated only once
        }
        size++;
    }

    public void enqueueMust(int x) {
        System.out.println("Total Free Space Now: " + totalFreeSpace());
        if (totalFreeSpace() > 0) {
            System.out.println("It Would Be Done by enqueue() Function ");
            enqueue(x);
            return;
        }

        // Size increases
        int temp[] = data;

        data = new int[size * 2];
        for (int i = 0; i < size; i++) {
            data[i] = temp[i];
        }
        System.out.println(" Queue is incraeses its size to insert it");

        data[++rear] = x;
        if (front == -1) {
            front = 0; // Front Will be updated only once
        }
        size++;

    }

    // Deletion
    public int dequeue() {
        if (size == 0) {
            front = -1;
            rear = -1;
            System.out.println("Underflow, Nothing to delete");

            return -1;
        }
        size--;
        int element = data[front];

        // Shift Element Towards Front
        for (int i = 0; i < rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;

        return element;
    }

    public int front() {
        return data[front];
    }

    public int rear() {
        return data[rear];
    }

    public int capacity() {
        return data.length;
    }

    public void clear() {
        front = -1;
        rear = -1;
        size = 0;
        Arrays.fill(data, -1); // All Field will be filled by -1
    }

}

public class Queue_Using_Array {
    public static void main(String[] args) {
        QuUA q = new QuUA(4);
        q.enqueue(13);
        System.out.println("Total Free Space: " + q.totalFreeSpace());
        q.enqueue(27);
        System.out.println("Capacity: " + q.capacity());
        q.enqueue(236);
        q.enqueue(45);
        System.out.println(q.dequeue());
        System.out.println("Total Free Space: " + q.totalFreeSpace());
        System.out.println(q.front() + " " + q.rear());

        q.enqueueMust(234);
        q.enqueueMust(239);
        System.out.println("Capacity: " + q.capacity());
        System.out.println("Size: " + q.size());

        System.out.println("Total Free Space: " + q.totalFreeSpace());
        System.out.println(q.front() + " " + q.rear());

    }
}


/*
 * OutPut=
 * Total Free Space: 3
 * Capacity: 4
 * 13
 * Total Free Space: 1
 * 27 45
 * Total Free Space Now: 1
 * It Would Be Done by enqueue() Function
 * Total Free Space Now: 0
 * Queue is incraeses its size to insert it
 * Capacity: 8
 * Size: 5
 * Total Free Space: 3
 * 27 239
 */

/*
 * 
 * TO Make Circuilar Queue
 * 
 * To Enqueue
 * rear=(rear+1)% data.length;
 * 
 * to Dequeue
 * front =(front+1)% data.length;
 * 
 * int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
 * // Declaring array literal
 * 
 */