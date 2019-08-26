package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

public class BinaryTree {

	static Node root;
	
	public static void main(String[] args) {
		BinaryTree tree = createBinaryTree();
		
		System.out.println(containsNode(5));
		
		// DFS
		traverseInOrder(root);
		System.out.println("");
		traversePreOrder(root);
		System.out.println("");
		traversePostOrder(root);
			
		// BFS
		traverseLevelOrder();
		
		Node cloneNode = cloneWithBFS();
		System.out.println(isSameTree(root, cloneNode));
	}
	
	public static Node cloneWithBFS() {
		if (root == null) { return null; }
		
		Queue<Node> nodes = new LinkedList<>();
	    nodes.add(root);
	    
	    Node cloneNode = new Node(root.value);
	    cloneNode.left = root.left;
	    cloneNode.right = root.right;
	    
	    Node tempLeftNode = new Node(0);
	    Node tempRightNode = new Node(0);
	    
	    while (!nodes.isEmpty()) {
	    		Node node = nodes.remove();
	    		
	    		System.out.print(" " + node.value);
	    		
	    		if (node.left != null) {
	    			nodes.add(node.left);    			
	    			tempLeftNode = node.left;
	    			
	    		}
	    		
	    		if (node.right != null) {
	    			nodes.add(node.right);
	    			cloneNode.right = node.right;
	    		}
	    }
	    
	    return cloneNode;
	}
	
	public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
        if (q == null || p == null) return false;
        if (p.value != q.value) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
	
	public static void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<Node> nodes = new LinkedList<>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.remove();
	 
	        System.out.print(" " + node.value);
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right!= null) {
	            nodes.add(node.right);
	        }
	    }
	}
	
	public static void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	
	public static void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print(" " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	public static void traversePostOrder(Node node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.value);
	    }
	}
	
	public static boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}
	
	private static boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    
	    if (current.value > value) {
	    		return containsNodeRecursive(current.left, value);
	    } else {
	    		return containsNodeRecursive(current.right, value);
	    }
	}
	
	private static BinaryTree createBinaryTree() {
	    BinaryTree bt = new BinaryTree();
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	 
	    return bt;
	}

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }
}
