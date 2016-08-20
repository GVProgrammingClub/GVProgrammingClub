/*
A binary tree implementation
Data is sorted and retrieved based on their keys
*/
public class BinaryTree<K extends Comparable, E> {
    
    public void insert(K key, E element) {
        if (empty) {
          node = new Node<K, E>(key, element);
          left = new BinaryTree<K, E>();
          right = new BinaryTree<K, E>();
          empty = false;
        } if (key.compareTo(node.key()) < 0) {
            left.insert(key, element);
        } if (key.compareTo(node.key()) > 0) {
            right.insert(key, element);
        }
    }
    
    public void mirror() {
        if (!empty) {
            BinaryTree<K, E> temp = left;
            left = right;
            right = temp;
            left.mirror();
            right.mirror();
        } 
    }
    
    public E get(K key) {
        if (empty)  {
            return null;
        } else if (key.compareTo(node.key())==0) {
            return node.element();
        } else if (key.compareTo(node.key())<0){
            return left.get(key);
        } else if (key.compareTo(node.key())>0){
            return right.get(key);
        }
        return null;
    }
    
    public boolean contains(K key) {
        if (empty)  {
            return false;
        } else if (key.compareTo(node.key())==0) {
            return true;
        } else if (key.compareTo(node.key())<0){
            return left.contains(key);
        } else if (key.compareTo(node.key())>0){
            return right.contains(key);
        }
        return false;
    }
    
    public int size() {
        if (!empty) {
            return 1 + left.size() + right.size();
        }
        return 0;
    }
    
    public void printTree() {
        if (!empty) {
            left.printTree();
            System.out.print(" [");
            System.out.print(node.key());
            System.out.print(": ");
            System.out.print(node.element());
            System.out.print("] ");
            right.printTree();
        }
    }
    
    public String toString() {
        if (!empty) {
            return left.toString() + " [" + node.key() + ": " + node.element() + "] " + right.toString();
        }
        return "";
    }
    
    public boolean equals(BinaryTree<K, E> tree) {
        if (empty && tree.isEmpty()){
            return true;
        } else if (key().compareTo(tree.key()) == 0 && element().equals(tree.element())) {
            return right.equals(tree.right()) && left.equals(tree.left());
        }
        return false;
    }
    
    public K key() {
        return node.key();
    }
    
    public E element() {
        return node.element();
    }
    
    public void setElement(E element) {
        node.setElement(element);
    }
    
    public BinaryTree<K, E> left() {
        return left;
    }
    
    public BinaryTree<K, E> right() {
        return right;
    }
    
    public boolean isEmpty() {
        return empty;
    }
    
    private Node<K, E> node = null;
    private BinaryTree<K, E> left = null;
    private BinaryTree<K, E> right = null;
    private boolean empty = true;
    
    protected class Node<K extends Comparable, E> {
        public Node(K key, E element) {
            this.key = key;
            this.element = element;
        }
        private K key = null;
        private E element = null;
        
        public K key() {
            return key;
        }
        
        public E element() {
            return element;
        }
        
        public void setElement(E element) {
            this.element = element;
        }
    }
}