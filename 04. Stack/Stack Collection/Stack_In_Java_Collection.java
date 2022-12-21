import java.util.Stack;
// In Java, Stack is a class that falls under the Collection framework that extends the Vector class.

public class Stack_In_Java_Collection {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(19);  // To Push
        stack.push(27);
        stack.push(39);
        stack.push(467);
        System.out.println("Stack Size :" + stack.size());
        System.out.println("Top element :" + stack.peek());
        System.out.println("Popped element :" + stack.pop());
        // Stack Class is inheriting Vector class
        
        System.out.println("Stack Size :" + stack.size());

        int arr[] = {19,257,369,4677};

        for(int element : arr){
            stack.push(element);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }




    }
}

/*
Stack Size :4
Top element :467
Popped element :467
Stack Size :3
4677
369
257
19
39
27
19 
*/
