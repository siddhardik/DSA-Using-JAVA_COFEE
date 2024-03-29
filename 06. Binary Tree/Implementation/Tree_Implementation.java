import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Tree<T> {
    T data;
    Tree<T> left;
    Tree<T> right;

    public Tree(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Tree<T> insertAtLeft(Tree<T> parent, T data) {
        if (parent == null) {
            this.data = data;
            this.left = null;
            this.right = null;
            return parent;
        }
        parent.left = new Tree<T>(data);
        return parent.left;

    }

    public Tree<T> insertAtRight(Tree<T> parent, T data) {
        if (parent == null) {
            this.data = data;
            this.left = null;
            this.right = null;
            return parent;
        }
        parent.right = new Tree<T>(data);
        return parent.right;

    }

}

public class Tree_Implementation {
    public static void main(String[] args) {
        // Tree<Integer> t = new Tree<Integer>(1);
        // t.left = new Tree<Integer>(2);
        // t.right = new Tree<Integer>(3);
        // t.left.left=new Tree<Integer>(4);
        // t.left.right=new Tree<Integer>(5);
        // t.right.left=new Tree<Integer>(6);
        // t.right.right=new Tree<Integer>(7);
        // t.right.left.left=new Tree<Integer>(8);
        // t.insertAtLeft(t, 45);
        // t.insertAtRight(t, 78);
        // Tree<Integer> root=takeInput(0);

        // printTree(root);
        // System.out.println("Total Number of Nodes : "+countNodes(root));
        // System.out.println("Total Number of Leaf Nodes : "+countLeafNodes(root));
        Tree<Integer> root = takeinputLevelWise();
        printTree(root);

    }

    // Take Tree input

    public static Tree<Integer> takeInput(Integer i) {
        Tree<Integer> root = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data For node : ");
        int data = sc.nextInt();
        System.out.println("");
        if (data == -1) {
            System.out.println("I am Back , Enter data For Previous Exixting  Parent node");
            return root;
        }
        root = new Tree<Integer>(data);
        System.out.println("Enter Data For the left Part Node for this current node : " + data);

        root.left = takeInput(data);
        System.out.println("Enter Data For the right Part Node for this Current Node: " + data);
        root.right = takeInput(data);
        return root;

    }

    // take Input LevelWise
    public static Tree<Integer> takeinputLevelWise() {
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1)
            return null;

        Tree<Integer> root = new Tree<Integer>(rootData);
        Queue<Tree<Integer>> pendingChildren = new LinkedList<Tree<Integer>>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            Tree<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of " + front.data);
            int left = s.nextInt();
            if (left != -1) {
                Tree<Integer> leftChild = new Tree<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }

            System.out.println("Enter right child of " + front.data);
            int right = s.nextInt();
            if (right != -1) {
                Tree<Integer> rightChild = new Tree<Integer>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    // Print A tree
    public static void printTree(Tree<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    // Number Of Nodes In An Binary Tree
    public static int countNodes(Tree<Integer> root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Count Leaf Nodes In An Binary Tree

    public static int countLeafNodes(Tree<Integer> root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {

            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);

    }

}
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Tree<T> {
    T data;
    Tree<T> left;
    Tree<T> right;

    public Tree(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Tree<T> insertAtLeft(Tree<T> parent, T data) {
        if (parent == null) {
            this.data = data;
            this.left = null;
            this.right = null;
            return parent;
        }
        parent.left = new Tree<T>(data);
        return parent.left;

    }

    public Tree<T> insertAtRight(Tree<T> parent, T data) {
        if (parent == null) {
            this.data = data;
            this.left = null;
            this.right = null;
            return parent;
        }
        parent.right = new Tree<T>(data);
        return parent.right;

    }

}

public class Tree_Implementation {
    public static void main(String[] args) {
        // Tree<Integer> t = new Tree<Integer>(1);
        // t.left = new Tree<Integer>(2);
        // t.right = new Tree<Integer>(3);
        // t.left.left=new Tree<Integer>(4);
        // t.left.right=new Tree<Integer>(5);
        // t.right.left=new Tree<Integer>(6);
        // t.right.right=new Tree<Integer>(7);
        // t.right.left.left=new Tree<Integer>(8);
        // t.insertAtLeft(t, 45);
        // t.insertAtRight(t, 78);
        // Tree<Integer> root=takeInput(0);

        // printTree(root);
        // System.out.println("Total Number of Nodes : "+countNodes(root));
        // System.out.println("Total Number of Leaf Nodes : "+countLeafNodes(root));
        Tree<Integer> root = takeinputLevelWise();
        printTree(root);

    }

    // Take Tree input

    public static Tree<Integer> takeInput(Integer i) {
        Tree<Integer> root = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data For node : ");
        int data = sc.nextInt();
        System.out.println("");
        if (data == -1) {
            System.out.println("I am Back , Enter data For Previous Exixting  Parent node");
            return root;
        }
        root = new Tree<Integer>(data);
        System.out.println("Enter Data For the left Part Node for this current node : " + data);

        root.left = takeInput(data);
        System.out.println("Enter Data For the right Part Node for this Current Node: " + data);
        root.right = takeInput(data);
        return root;

    }

    // take Input LevelWise
    public static Tree<Integer> takeinputLevelWise() {
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1)
            return null;

        Tree<Integer> root = new Tree<Integer>(rootData);
        Queue<Tree<Integer>> pendingChildren = new LinkedList<Tree<Integer>>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            Tree<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of " + front.data);
            int left = s.nextInt();
            if (left != -1) {
                Tree<Integer> leftChild = new Tree<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }

            System.out.println("Enter right child of " + front.data);
            int right = s.nextInt();
            if (right != -1) {
                Tree<Integer> rightChild = new Tree<Integer>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    // Print A tree
    public static void printTree(Tree<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    // Number Of Nodes In An Binary Tree
    public static int countNodes(Tree<Integer> root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Count Leaf Nodes In An Binary Tree

    public static int countLeafNodes(Tree<Integer> root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {

            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);

    }

}