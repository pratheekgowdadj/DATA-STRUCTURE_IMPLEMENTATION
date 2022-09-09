package trees;

public class BinarySearchTree {
    static class Node{
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    Node root;
    public BinarySearchTree(){
        root = null;
    }

    void insert(int key){
        root = insertKey(root, key);
    }

    private Node insertKey(Node root, int key) {
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insertKey(root.left, key);
        }
        else if(key > root.key)
            root.right = insertKey(root.right, key);
        return root;
    }

    void inOrder(){
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.key + " -> ");
            inOrderRec(root.right);
        }
    }


}
