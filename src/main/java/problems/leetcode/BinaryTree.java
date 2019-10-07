package problems.leetcode;

public class BinaryTree
{
    private Node root;

    BinaryTree(){
        this.root=null;
    }

    private int depth(Node root){

        int left=0;
        int right=0;

        if(root==null)
            return 0;

        left = 1+depth(root.left);

        right = 1+depth(root.right);

        return left>right?left:right;
    }

    private void printInorder(Node root){
        if(root!=null){
            printInorder(root.left);
            System.out.println(root.value);
            printInorder(root.right);
        }

    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new Node(3);
        binaryTree.root.left = new Node(9);

        binaryTree.root.right = new Node(20);
        binaryTree.root.right.left = new Node(15);
        binaryTree.root.right.right = new Node(7);
        binaryTree.printInorder(binaryTree.root);
        System.out.println(binaryTree.depth(binaryTree.root));
    }
}
