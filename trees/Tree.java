package trees;



public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    static class Node{
        int item;
        Node left, right;

        public Node(int item){
            this.item = item;
            left = right = null;
        }
    }

    void postOrder(Node node){
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.item  + " -> ");
    }

    void inOrder(Node node){
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.item + " -> ");
        inOrder(node.right);
    }

    void preOrder(Node node){
        if(node == null) return;

        System.out.print(node.item + " -> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static int depth(Node node){
        int d = 0;
        while(node != null){
            d++;
            node = node.left;
        }
        return d;
    }

    boolean isFullBinaryTree(Node node){
        if(node.left == null && node.right == null) return true;

        if((node.left != null) && (node.right != null))
            return (isFullBinaryTree(node.left) && isFullBinaryTree(node.right));

            return false;
    }

     boolean isPerfectBinaryTree(Node node, int d , int level){
        if(node == null) return true;
        if(node.left == null && node.right == null)
            return (d == level + 1);

        if(node.left == null || node.right == null) return  false;

        return isPerfectBinaryTree(node.left, d,level + 1) && isPerfectBinaryTree(node.right, d, level + 1);

    }

     boolean is_Perfect(Node root){
        int d = depth(root);
        return isPerfectBinaryTree(root, d, 0);
    }
}
