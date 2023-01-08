import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> childRec;

    // Constructor
    TreeNode(T data){
        this.data=data;
        childRec=new ArrayList<TreeNode<T>>();
    }

    public  void PrintGenericTree(TreeNode<T> root){
                if(root==null){
                    return ;
                }
              // No needs to Base Case  of Recursion it will be handled by Loop
               // Print The Data
               System.out.println(root.data);
               for(int i=0;i<root.childRec.size();i++){
                System.out.println("Child Of " + root.data+ " =>");
                PrintGenericTree(root.childRec.get(i));
               }

    }

    public  void PrintGenericTreeSpecial(TreeNode<T> root){
        if(root==null){
            return ;
        }
      // No needs to Base Case  of Recursion it will be handled by Loop
       // Print The Data
       System.out.print(root.data+" :");
       for(int i=0;i<root.childRec.size();i++){
         System.out.print(root.childRec.get(i).data+" ");
       }
       System.out.println();
       for(int i=0;i<root.childRec.size();i++){
        PrintGenericTreeSpecial(root.childRec.get(i));
       }

}
public  int  totalNodes(TreeNode<T> root){
    int sum=0;
    if(root==null){
        return sum;
    }
  // No needs to Base Case  of Recursion it will be handled by Loop
   // Print The Data
   sum+=1;
  

   for(int i=0;i<root.childRec.size();i++){
    sum+=totalNodes(root.childRec.get(i));
   }

   return sum;
}





}

public class GenericTreeUse{

    public static TreeNode<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
         Queue<TreeNode<Integer>> pendingNodes= new LinkedList<>();
        System.out.println("Enter the root data ");
        int rootData= s.nextInt();
        if(rootData==-1)
            return null;

        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front= pendingNodes.poll();
            System.out.println("Enter no. of children of "+ front.data);
            int numChild= s.nextInt();
            for(int i=0;i<numChild;i++){
                System.out.println("Enter the  "+(i+1)+" no child data of "+ front.data);
                int childData= s.nextInt();
                TreeNode<Integer> childNode= new TreeNode<>(childData);
                front.childRec.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }




    
    public static void main(String[] args) {
        // TreeNode<Integer> root = new TreeNode<Integer>(4005);
        // TreeNode<Integer> n1 = new TreeNode<Integer>(455);
        // TreeNode<Integer> n2 = new TreeNode<Integer>(465);
        // TreeNode<Integer> n3 = new TreeNode<Integer>(495);
        // TreeNode<Integer> n4 = new TreeNode<Integer>(405);
        // TreeNode<Integer> n5 = new TreeNode<Integer>(425);
        // root.childRec.add(n1);
        // root.childRec.add(n2);
        // n1.childRec.add(n4);
        // n2.childRec.add(n5);
        // n2.childRec.add(n3);
        TreeNode<Integer> root =takeInput();
         root.PrintGenericTree(root);
        root.PrintGenericTreeSpecial(root);
        System.out.println(root.totalNodes(root));

    }
}
   

 

    
             
        



