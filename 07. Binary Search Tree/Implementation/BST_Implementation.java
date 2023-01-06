
 class BST{
       int data ;
       BST left;
       BST right;

       // BST constructor
       BST( int data) {
        this.data=data;
        left=null;
        right=null;
       }

       // Insert A New data
       void insertData(int  value)
       {
        if(this.data>value){
            if(this.left!=null)
            {
                // Node Present , Need More Traverse
                this.left.insertData(value);
            }
            else{
                this.left=new BST(value);
            }
        }
        else{
            if(this.right!=null)
            {
                 // Node Present , Need More Traverse
                this.right.insertData(value);
            }
            else{
                this.right=new BST(value);
            }
        }
        
        }

        // Print the BST , Inorder To view Sorted Answer

        void printBST(BST root){
            if(root==null){
                   return;
                   // Nothing to print
            }
            printBST(root.left);
            System.out.println(root.data+" ");
            printBST(root.right);
        }


}

public class BST_Implementation {
    public static void main(String[] args) {
        BST b=new BST(23);
        b.insertData(56);
        b.insertData(67);
        b.insertData(23);
        b.insertData(13);
        b.insertData(567);
        b.insertData(647);
        b.insertData(230);
        b.insertData(1389);
        b.printBST(b);
    }
    
}
