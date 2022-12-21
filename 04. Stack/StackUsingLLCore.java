class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}



public class StackUsingLLCore{

//Define the data members
  private Node head;
private int size;


public StackUsingLLCore() {
    //Implement the Constructor
    head= null;
    size=0;
}



/*----------------- Public Functions of Stack -----------------*/


public int getSize() { 
     return size;
}

public boolean isEmpty() {
    return (size==0);
}

public void push(int element) {
    //Pushing happening at he begining of the LL
    Node newNode = new Node(element);
    newNode.next = head;
    head= newNode;
    size++;

}

public int pop() {
    if(head==null){
    return -1;
}
//since we are pushing data in the front so the so we must remove the data from the front itself
int temp =head.data;
head = head.next;
size--;
return temp;

}



public int top() {
     if(head==null){
    return -1;
}
return head.data;
}


}