
// Queue Implementation Using Linked List
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}



public class Queue_Using_LL {

//Define the data members
private Node head;
private Node tail;
private int size;



public Queue_Using_LL() {
    //Implement the Constructor
    head=null;
    tail=null;
    size=0;
}



/*----------------- Public Functions of Stack -----------------*/


public int getSize() { 
    //Implement the getSize() function
    return size;
}


public boolean isEmpty() { 
    //Implement the isEmpty() function
    return size == 0;
}


public void enqueue(int data) {
    //Implement the enqueue(element) function
    Node newNode = new Node(data);
    if(isEmpty()) {
        head = newNode;
        tail = newNode;
    }
    else {
        tail.next = newNode;
        tail = newNode;
    }
    size ++;
}


public int dequeue() {
    //Implement the dequeue() function
    if(isEmpty()) {
        return -1;
    }
    int temp = head.data;
    head = head.next;
    size --;
    if(size==0) {
        head = null;
        tail = null;
    }
    return temp;
}


public int front() {
    //Implement the front() function
    if(isEmpty()) {
        return -1;
    }
    return head.data;

}
}

