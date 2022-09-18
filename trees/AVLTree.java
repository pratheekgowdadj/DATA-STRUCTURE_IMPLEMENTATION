package trees;

public class AVLTree  {
    static class Node{
        int key, height;
        Node left,right;

        public Node(int key) {
            this.key = key;
            height = 1;
            left = right = null;
        }
    }

    Node root;

    public AVLTree() {
        root = null;
    }

    public int height(Node N){
        if(N == null) return 0;

        return N.height;
    }
    int max(int a, int b){
        return Math.max(a, b);
    }

    public Node rightRotate( Node y){
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left) , height(y.right) + 1);
        x.height = max(height(x.left),  height(x.right) + 1);
        return x;
    }

    public Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right) + 1);
        y.height = max(height(y.left), height(y.right) + 1);
        return y;
    }

    public int getBalanceFactor(Node N){
        if(N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    
}
