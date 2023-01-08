import java.util.ArrayList;

import java.util.ArrayList;
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
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(4005);
        TreeNode<Integer> n1 = new TreeNode<Integer>(455);
        TreeNode<Integer> n2 = new TreeNode<Integer>(465);
        TreeNode<Integer> n3 = new TreeNode<Integer>(495);
        TreeNode<Integer> n4 = new TreeNode<Integer>(405);
        TreeNode<Integer> n5 = new TreeNode<Integer>(425);
        root.childRec.add(n1);
        root.childRec.add(n2);
        n1.childRec.add(n4);
        n2.childRec.add(n5);
        n2.childRec.add(n3);
         root.PrintGenericTree(root);
        root.PrintGenericTreeSpecial(root);
        System.out.println(root.totalNodes(root));

    }
}
   

 

    
             
        



