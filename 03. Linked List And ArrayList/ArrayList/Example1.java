import java.util.ArrayList;
public class Example1{
    public static void main(String[] args) {
        
        // ArrayList<Integer> arr=new ArrayList<>();  // Creating  A ArrayList with 
        //default capacity 10
        ArrayList<Integer> arr=new ArrayList<>(20);  // with capacity 20
        arr.add(23); // Add An element at the end
        arr.add(35);
        System.out.println(arr.size());   // size of ArrayList
        arr.add(1,46);  // Add Element in the Particular Index
        System.out.println(arr.get(2)); // Element int the particular Index
        System.out.println(arr.get(1));
        arr.remove(2);
        arr.add(67);
        arr.add(467);
        System.out.println(arr.get(arr.size()-1));
        System.out.println(arr.get(0));
        arr.remove(0);
        System.out.println(arr.get(0));
        Integer i=467;
        arr.remove(i);// Pass Object to remove method
        System.out.println(arr.get(arr.size()-1));  
    }

}
/*
Output-
2
35
46
467
23
46
67
  
 */
