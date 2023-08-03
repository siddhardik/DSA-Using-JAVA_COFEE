import java.util.ArrayList;
// Let Consider The Min Priority Queue
class Priority_Queue_Exception extends Exception {
   
}

class Element<T>{
    T val;
    int priority;
   public  Element(T val,int priority){
        this.val=val;
        this.priority=priority;
    }
}

class Priority_Queue<T>{
private ArrayList<Element<T>> heap;
   // Contructor
   public Priority_Queue(){
                heap=new ArrayList<>();
   }

   // Get Minimum
   public T getMin ()throws Priority_Queue_Exception{
    if(heap.isEmpty()){
        System.out.println("Priority_Queue is Empty, We don't have any ELement");
              throw new Priority_Queue_Exception();
    }
    return heap.get(0).val;
   }

   // Insert Element
   public void insert(T val, int priority){
    Element<T> e= new Element<> (val, priority);
    heap.add(e);
    int childIndex= heap.size()-1;
    int parentIndex=(childIndex-1)/2;

    while(childIndex>0){
        if(heap.get(childIndex).priority < heap.get(parentIndex).priority){
            Element<T> temp= heap.get(childIndex);
            heap.set(childIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            childIndex= parentIndex;
            parentIndex= (childIndex-1)/2;
        }else{
            return;
        }
  }
}

  // Remove An Element
  public T removeMin() throws Priority_Queue_Exception{
    if(isEmpty()){
        throw new Priority_Queue_Exception();
    }
    Element<T> removed= heap.get(0);
    T ans = removed.val;

    heap.set(0, heap.get(heap.size()-1));
    heap.remove(heap.size()-1);

    int parentIndex=0;
    int leftChildIndex= 2*parentIndex+1;
    int rightChildIndex= 2*parentIndex +2;

    while(leftChildIndex<heap.size()){
        int minIndex= parentIndex;
        if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority){
            minIndex= leftChildIndex;
        }
        if(heap.get(rightChildIndex).priority < heap.get(minIndex).priority){
            minIndex= rightChildIndex;
        }
        Element<T> temp= heap.get(minIndex);
        heap.set(minIndex, heap.get(parentIndex));
        heap.set(parentIndex, temp);
        parentIndex= minIndex;
        leftChildIndex= 2*parentIndex+1;
        rightChildIndex= 2*parentIndex +2;
    }
    return ans;

}

  // Get Size
  public int getSize(){
    return heap.size();
  }

  // Check Empty Or Not
  public boolean isEmpty(){
    return getSize()==0;
  }
}


public class Test{
    public static void main(String[] args) throws Exception {
        // System.out.println("VEry Good");
        Priority_Queue<String> pq= new Priority_Queue<String>();
        pq.insert("abc", 15);
        pq.insert("def", 13);
        pq.insert("fsas", 90);
        pq.insert("fsafsafa", 150);
        pq.insert("xvxzxvssa", 120);
        // System.out.println("Very Good");
        System.out.println(pq.getMin());
            pq.removeMin();
            System.out.println(pq.getMin());
            pq.removeMin();
            System.out.println(pq.getMin());
            pq.removeMin();


        while(!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }

    }
}