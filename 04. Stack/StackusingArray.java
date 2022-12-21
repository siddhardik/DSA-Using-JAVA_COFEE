class StackFullException extends Exception {
    public StackFullException() {
        super();
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException() {
        super();
    }
}


// create A Class Of Stack
class StackUArray{
        
   private int data[];  // No One Can Change the data via index
   private int topIndex;   // No One Can Change the data via index


    public StackUArray(int totalSpace){
        data = new int[totalSpace];
        topIndex = -1;   // Initially No element is in the stack

    }

    public void pop(){
        if(topIndex == -1){
            System.out.println("Stack Underflow");
            return;
        }

        topIndex--;

    }

    public int size(){
        return topIndex+1;
    }

    public int top(){
        if(topIndex == -1){
            System.out.println("Stack Underflow");
            return -1;

            // Or
            // throw new StackEmptyException();

        }
        return data[topIndex];
    }

    public int totalFreeSpace(){    // Extra  Bakchodi
        return (data.length - topIndex - 1);

    }

    public boolean isEmpty(){
        /*
        if(topIndex == -1){

           return true;
        }
            
            return false; 
            */
            return topIndex == -1;
        
    }

    public void push(int x){
        if(topIndex == data.length-1){
            System.out.println("Overflow");
            return;

            // or 
            // throw new StackFullException();    // throw exception


}
        else{
            // topIndex++;
            data[++topIndex] = x;
        }
    }
  
    // pushMust If Space is not enough , it will increase the space of stack
    public void pushMust(int x){
        if(totalFreeSpace()!=0){
            push(x);
            return;
        }
        
        if(topIndex == data.length-1){
            // int temp[] = new int[data.length];
            // System.arraycopy(data, 0, temp, 0, topIndex+1);
            int temp[] =data;

            data =new int[data.length*2];
            for(int i=0;i<temp.length;i++){
                data[i] = temp[i];
            }
    

    }

        else{
            data[++topIndex] = x;
        }
    }

    /*

    private void doubleCapacity(){
    //  System.out.println("doubleCapacity");
        int temp[]= data;
        data= new int [2 * temp.length];
        for(int i=1;i<temp.length;i++){
            data[i]= temp[i];
        }

    }

    
      public void push(int elem) throws StackFullException{
          //If stack is full
          if(topIndex==data.length-1){
              StackFullException e= new StackFullException();
              throw e;
              //Throw Exception
          }
          topIndex++;
          data[topIndex]= elem;

    }
    //O(1)
    public int top() throws StackEmptyException{
      if(topIndex==-1){
        //Throw stack empty exception
        throw new StackEmptyException();
      }
        return data[topIndex];

    }
    //O(1)
    public int pop() throws StackEmptyException{

        if(topIndex==-1){
            throw new StackEmptyException()
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
     */
}

public class StackusingArray {
    public static void main(String[] args) {

        StackUArray stack = new StackUArray(5);
          stack.push(45);
          stack.push(67);
          stack.push(78);
          stack.push(89);
          System.out.println("Size : "+stack.size());
          System.out.println("Total Free Space : "+stack.totalFreeSpace());
          stack.push(90);
          stack.push(91);
          stack.pushMust(92);
          System.out.println("Size : "+stack.size());
          System.out.println("Total Free Space : "+stack.totalFreeSpace());
          stack.push(93);
          stack.pushMust(4);
          System.out.println("Size : "+stack.size());
          System.out.println("Total Free Space : "+stack.totalFreeSpace());

          System.out.println(stack.isEmpty());
          System.out.println(stack.top());
          stack.pop();
          System.out.println(stack.top());
          stack.pop();
          System.out.println(stack.isEmpty());


        
    }
    
}


/*
outPut 
Size : 4
Total Free Space : 1
Overflow
Size : 5
Total Free Space : 5
Size : 7
Total Free Space : 3
false
4
93
false


 
 */


