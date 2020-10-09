
/**
 * Malick Bocoum
 * 
 * This is the driver class for the home-grown binary search tree.
 * Complete the run method in the 4 places mentioned below.
 * 
 * @author kinni1p
 *
 */
public class Driver {
	private BST aTree;
	
	public Driver() {
		aTree = new BST();
	}

	public static void main(String[] args) {
		Driver aDriver = new Driver();
		aDriver.run();
	}
	
	private void run() {
		System.out.println("Empty tree");
		aTree.print();
	
		TreeNode cur = new TreeNode(30);
		aTree.insert(aTree.getRoot(), cur);
		System.out.println("After 1st element added");
		aTree.print();
		
		cur = new TreeNode(20);
		aTree.insert(aTree.getRoot(), cur);
		System.out.println("After 2nd element added");
		aTree.print();
		
		cur = new TreeNode(10);
		aTree.insert(aTree.getRoot(), cur);
		cur = new TreeNode(40);
		aTree.insert(aTree.getRoot(), cur);
		cur = new TreeNode(35);
		aTree.insert(aTree.getRoot(), cur);
		cur = new TreeNode(45);
		aTree.insert(aTree.getRoot(), cur);
		System.out.println("After all elements added");
		aTree.print();
		
		System.out.println("Print the tree IN ORDER here:");
		// PUT THE CORRECT PRINT CALL HERE
		aTree.printInOrder();
		
		System.out.println("Print the tree PRE ORDER here:");
		// PUT THE CORRECT PRINT CALL HERE
		aTree.printPreOrder();
		System.out.println("Print the tree POST ORDER here:");
		// PUT THE CORRECT PRINT CALL HERE
		aTree.printPostOrder();
		System.out.println("Print the tree LEVEL ORDER here:");
		// PUT THE CORRECT PRINT CALL HERE
		aTree.printLevelOrder();
	}

}