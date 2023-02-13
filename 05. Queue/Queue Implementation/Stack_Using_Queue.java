import java.util.Queue;
import java.util.LinkedList;
public class Stack_Using_Queue {


    //Define the data members
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;



    public Stack_Using_Queue() {
        //Implement the Constructor
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
       q1.add(element);
       size++;
    }

    public int pop() {
        //Implement the pop() function
       if(size==0){
           return -1;
       }

       while(q1.size() !=1){
             q2.add(q1.poll());
       }
       size--;
        while(!q2.isEmpty()){
           q1.add(q2.poll());
       }


       return q1.poll();


    }

    public int top() {
        //Implement the top() function
          if(size==0){
           return -1;
       }

       while(q1.size()!=1){
             q2.add(q1.poll());
       }

       int temp= q1.poll();
       
       while(!q2.isEmpty()){
           q1.add(q2.poll());
       }
       q1.add(temp);
       return temp;

    }
}