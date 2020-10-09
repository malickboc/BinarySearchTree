
	/**
	 * Home-grown tree node, containing the item represented by each node 
	 * and 2 branches for the binary tree.
	 * 
	 * @author kinni1p
	 *
	 */
	public class TreeNode implements Comparable<TreeNode> {
		int num; // The item the node represents
		TreeNode left; // The left subtree
		TreeNode right;  // The right subtree
		public char[] root;
		
		/**
		 * Parameterized constructor
		 * @param num The value represented by the node.
		 */
		public TreeNode(int num) {
			this.num = num;
			left = null;
			right = null;
		}

		/**
		 * Accessor method for the left subtree.
		 * @return The left subtree
		 */
		public TreeNode getLeft() {
			return left;
		}

		/**
		 * Mutator method for the left subtree.
		 * @param left The left subtree to add.
		 */
		public void setLeft(TreeNode left) {
			this.left = left;
		}

		/**
		 * Accessor method for the right subtree.
		 * @return The right subtree
		 */
		public TreeNode getRight() {
			return right;
		}

		/**
		 * Mutator method for the left subtree.
		 * @param right The right subtree to add.
		 */
		public void setRight(TreeNode right) {
			this.right = right;
		}

		/**
		 * Accessor method for the number
		 * @return The number represented by the node.
		 */
		public int getNum() {
			return num;
		}
		
		/**
		 * String representation of the node.
		 */
		public String toString() {
			return Integer.toString(num);
		}

		@Override
		public int compareTo(TreeNode o) {
			int result = num - o.num;
			return result;
		}
	}

