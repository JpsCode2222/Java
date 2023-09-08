public class BinarySearchTreeDeleteNode {
    // Node
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    // Insert Node
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // Left Subtree
            root.left = insert(root.left,val);
        }
        else{
            // Right Subtree
            root.right = insert(root.right, val); 
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    
    // Search Elemetn 
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    // Delete Node 
    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left = delete(root.left,val);
        }
        else if(root.data < val){
            root.right = delete(root.right,val);
        }
        else{
            // root.data == val
            // Case 1
            if(root.left == null && root.right == null){
                return null;
            }

            // Case2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // Case3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    // Main
    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        root = delete(root, 1);
        System.out.println();
        inOrder(root);
    }
}
