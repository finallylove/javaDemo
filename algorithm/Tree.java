/**
 * Created by lbw on 2015/3/9.
 */
public class Tree<T> {
    public static int num=0;
    private Node<T> root;

    public Tree() {
    }

    public void buildTree() {

    }

    public Node<T> createTree(T[] arr, int position) {
        Node<T> node=null;
        if (arr != null && arr.length > position) {
            num++;
            if (arr[position].equals("#")) {
                return null;
            } else {
                node= new Node<>();
                node.setValue(arr[position]);
                node.setLeft(createTree(arr, ++position));
                node.setRight(createTree(arr, ++position));
                return node;
            }
        }
        return null;
    }

    public void preOrder(Node<T> node) {
        if (node != null) {
            System.out.print(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
            System.out.print("  ");
        }

    }

    class Node<T> {

        private Node<T> left;
        private Node<T> right;
        private T value;

        public Node() {

        }

        Node(Node<T> left, Node<T> right, T value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
