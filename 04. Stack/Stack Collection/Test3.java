import java.util.Stack;
class Test3 {
    public static void main (String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        while(stack.isEmpty())
        {
            stack.push(10);
        }
        System.out.print(stack.pop()+" "+stack.size());
    }
}
