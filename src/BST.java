import java.util.LinkedList;

/**
 * The home-grown binary search tree.
 * From class, this tree has the ability to insert a new
 * node and to print the tree elements.
 * 
 * Your task is to implement the methods 
 * to print the tree elements in the orders specified in the lab exercise.
 * 
 * @author kinni1p
 *
 */
public class BST {
	private TreeNode root; // The root of the BST
	
	/**
	 * Default constructor
	 */
	public BST() {
		root = null;
	}

	/** 
	 * Accessor method to get the tree root.
	 * @return The tree root.
	 */
	public TreeNode getRoot() {
		return root;
	}
	
	/**
	 * Checks whether the tree is empty or not
	 * @return true = empty; false = not empty
	 */
	public boolean isEmpty() {
		boolean empty = true;
		
		if(root != null) {
			empty = false;
		}
		return empty;
	}
	
	/**
	 * The public interface to the recursive print method.
	 */
	public void print() {
		print(root);
		System.out.println();
	}
	
	/**
	 * Prints the tree elements recursively, in ascending order
	 * @param cur The current node being visited
	 */
	private void print(TreeNode cur) {
		if(cur != null) { // If cur == null do nothing
			print(cur.getLeft());
			System.out.print(cur + " ");
			print(cur.getRight());
		}
	}
	
	/**
	 * Inserts a new node into the BST, while maintaining the properties of a BST.
	 * @param cur The current node being searched
	 * @param newNode The new node being added
	 */
	public void insert(TreeNode cur, TreeNode newNode) {
		// Empty tree: base case
		if(isEmpty() == true) {
			root = newNode;
		}
		// General case 
		else if(cur != null){
			if(cur.compareTo(newNode) > 0) {
				if(cur.getLeft() == null) {
					cur.setLeft(newNode);
				}
				else {
					insert(cur.getLeft(), newNode);
				}
			}
			else {
				if(cur.getRight() == null) {
					cur.setRight(newNode);
				}
				else {
					insert(cur.getRight(), newNode);
				}
			}

		}
	}
	
	
	public void printInOrder() {
		printInOrder(root);
		System.out.println();
	}
	public void printInOrder (TreeNode cur) {
		 
			if(cur != null) { // If cur == null do nothing
				
				
				printInOrder(cur.getLeft());
				System.out.print(cur + " ");
				printInOrder(cur.getRight());
			}
		
	}

	public void printPreOrder() {
		printPreOrder(root);
		System.out.println();
	}
public void printPreOrder(TreeNode cur) {
		 
		if(cur != null) { // If cur == null do nothing
			
			System.out.print(cur + " ");
			printPreOrder(cur.getLeft());
			printPreOrder(cur.getRight());
		}
}
		public void printPostOrder() {
			printPostOrder(root);
			System.out.println();
		}
	public void printPostOrder(TreeNode cur) {
			 
			if(cur != null) { // If cur == null do nothing
				
				
				printPostOrder(cur.getLeft());
				printPostOrder(cur.getRight());
				System.out.print(cur + " ");
			}
		
		
}



public void printLevelOrder () {
	
	if (root == null) {
		
		return;
	}
	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	queue.add(root);
	while(!queue.isEmpty()) {
		TreeNode current=  queue.pop();
		System.out.print(current.num+" ");
		if (current.left!= null) {
			queue.add(current.left);
		}
		if (current.right!= null) {
			queue.add(current.right);
		}
	}
}
	}