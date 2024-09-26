package DSA.Tree;

class Node {
    int data;
    Node left;
    Node right;
	private Node root;

    public Node(int data) {
        this.data = data;
    }

    public class BinaryTree {

        Node root;

		public void insert(int i) {
		}

        public void inorder() {
        }
    }

    public Node insertRec(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {

            root.left = root.insertRec(root.left, data);

        }

        else if (data > root.data) {

            root.right = root.insertRec(root.right, data);

        }

        return root;
    }

    public void inorder(){

        inorderRec(root);

    }

    public void inorderRec( Node root){
        if(root!= null){
            inorderRec(root.left);
            System.out.print(root.data+" ");

            inorderRec(root.right);
        }
    }

}
