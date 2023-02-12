import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();  // List is An Object  
        // Its A Doubly Linked List

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,100);
        System.out.println(list.get(1));
        list.addFirst(34);
        System.out.println(list.get(1));
        list.addLast(78);
        System.out.println(list.size());

        // How to traverse the list
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
                    }

        list.remove(1);  // Remove An Element
        list.removeFirst();
        list.removeLast();
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.set(1,356);  // To Replace An Element

        System.out.println(list.get(1));
        System.out.println(list.size());



        list.clear();  // TO remove all elements

        System.out.println(list.size());
        System.out.println(list.isEmpty());  // Check if the list is empty or not

        



    }
}
