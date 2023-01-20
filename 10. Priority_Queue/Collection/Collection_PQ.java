import java.util.PriorityQueue;

public class Collection_PQ {
    public static void main(String[] args) {
        
        // By Default Min Priority Queue 
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(23);
        queue.add(263);
        queue.add(203);
        queue.add(2);

        while(!queue.isEmpty()){
               System.out.println("Now  Top Element:  " +queue.peek()); 
               // only return the top element
               System.out.println("Now  Top Element via poll:  " +queue.poll());
                // Remove and Return the top 
        }


    }

}
