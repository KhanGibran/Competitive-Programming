package problems.leetcode.practice;

public class HeightBinaryTree
{
    private TreeNode root;

    HeightBinaryTree(){
        this.root=null;
    }

    private int depth(TreeNode root){

        int left=0;
        int right=0;

        if(root==null)
            return 0;

        left = 1+depth(root.left);

        right = 1+depth(root.right);

        return left>right?left:right;
    }

    private void printInorder(TreeNode root){
        if(root!=null){
            printInorder(root.left);
            System.out.println(root.value);
            printInorder(root.right);
        }

    }
    public static void main(String[] args) {
        HeightBinaryTree binaryTree = new HeightBinaryTree();

        binaryTree.root = new TreeNode(3);
        binaryTree.root.left = new TreeNode(9);

        binaryTree.root.right = new TreeNode(20);
        binaryTree.root.right.left = new TreeNode(15);
        binaryTree.root.right.right = new TreeNode(7);
        binaryTree.printInorder(binaryTree.root);
        System.out.println(binaryTree.depth(binaryTree.root));
    }
}
