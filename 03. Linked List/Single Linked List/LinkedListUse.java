import java.util.Scanner;
public class LinkedListUse {
    // Print the linked list
    public static void PrintLinkedList(Node<Integer> node) {
        while (node.next!= null) {
            System.out.print(node.data + ".");
            node = node.next;
        }
        System.out.println(node.data + ".null");

    
    }

    // Optimize Taking Input
   



    


    // Length Of Linked List

    public static int LengthOfLinkedList(Node<Integer> node) {
        int count = 0;
        Node<Integer> temp=node;
        while (temp!= null) {
            temp= temp.next;
            count++;
        }
        return count;
    }

    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        Node<Integer> nodeToBeInserted= new Node<Integer>(data);
  
      if(pos==0){
        nodeToBeInserted.next= head;
        head= nodeToBeInserted;
      }else{
          int count=0;
        Node<Integer> prev= head;
          while(count<pos-1 && prev!=null){
            count++;
            prev=prev.next;
          }
          if(prev!=null){
              nodeToBeInserted.next= prev.next;
              prev.next= nodeToBeInserted;
          }
      }
  
      return head;
    }

    // Delete Node

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		// Write your code here.
		if(head==null )
            return head;
        if(pos==0)
            return head.next;
            
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null && count<pos-1)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
            return head;
        if(temp.next!=null)
            temp.next=temp.next.next;
         
        
        return head;
	}

// Create A Linked List

    public static Node<Integer> CreateLinkedList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many nodes would you like to create? ");
        int n=sc.nextInt();
        System.out.println("Enter the value of the node");
        int value=sc.nextInt();
        Node<Integer> head1=new Node<Integer>(value);
        Node<Integer> nextOne= head1;
        
        for(int i=1;i<n;i++){
            System.out.println("Enter the value of the node");
            int val=sc.nextInt();
            Node<Integer> temp=new Node<Integer>(val);
           
            nextOne.next=temp;
            nextOne=nextOne.next;

        }
          return head1;
}

// Find A Node

public static int findNode(Node<Integer> head, int n) {
		
    Node<Integer> temp =head;
    int count =0;
    int index=-1;
    while(temp!=null){
        if(temp.data== n){
            index=count;
            break;
        }
        count++;
        temp=temp.next;
    }
            return index;
}

    public static void main(String[] args) {
       // Node n1=new Node(23); use normal Class
       
       // Now Use generic
       /*
        
        Node<Integer> n1=new Node<>(23);
         System.out.println(n1.data); // 23
         System.out.println(n1.next);
         System.out.println(n1);
         Node<Integer> n2=CreateLinkedList();
         PrintLinkedList(n2);
         System.out.println(n2);
         System.out.println(LengthOfLinkedList(n2));
        */
        Node<Integer> n3=CreateLinkedList();
        PrintLinkedList(n3);
        deleteNode(n3, 1);
        PrintLinkedList(n3);
        insert(n3, 2, 45);
        PrintLinkedList(n3);


    }
}
