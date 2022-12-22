import java.util.Queue;
import java.util.LinkedList;
// Queue is An Interface In Java Collection 
// And Linked List Implements Those Methods of Queue Interface
public class Queue_In_Collection {
   public static void main(String[] args) {
    Queue<Integer> queue=new LinkedList<>();
    boolean e= queue.add(23);
    e= queue.add(456);
    queue.add(567);
    System.out.println("Size: "+queue.size());
    System.out.println("Is empty: "+queue.isEmpty());
    System.out.println("Front: "+queue.peek());
    System.out.println("Fast Remove: "+queue.poll()); // To remove
    System.out.println("Size: "+queue.size());

}
}

/*
Size: 3
Is empty: false
Front: 23
Fast Remove: 23
Size: 2 
*/









 


   
   




