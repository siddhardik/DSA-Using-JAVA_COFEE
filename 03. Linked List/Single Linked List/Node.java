/*
public class Node{
    int data;
    Node next;

    // Constructor

    Node(int data){
        this.data=data;
        next=null;  // Or this.next=null;  by default any ref var is null

    }
} */


// use Generics
public class Node<T>{
    T data;
    Node<T> next;

    // Constructor

    Node(T data){
        this.data=data;
        next=null;  // Or this.next=null;  by default any ref var is null

    }
}