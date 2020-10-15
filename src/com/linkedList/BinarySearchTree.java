
package com.linkedList;

public class BinarySearchTree<T extends Comparable> {
	
	private static int flag = 0;
	static BinaryNode root = new BinaryNode();

	/**
	 * @param node Contains node to be added to tree.
	 * @param root Contains root node.
	 * Adds a node in binary tree
	 */
	public static void addBinaryNode(BinaryNode node, BinaryNode root) {
		if (root == null)
			root = node;
		int result = compareTo(root, node);
		if (result == -1) {
			BinaryNode right = (BinaryNode) root.getRight();
			if (right == null) {
				root.setRight(node);
				return;
			}
			addBinaryNode(node, right);
		}
		if (result == 1) {
			BinaryNode left = (BinaryNode) root.getLeft();
			if (left == null) {
				root.setLeft(node);
				return;
			}
			addBinaryNode(node, left);
		}
		if (root.getKey() == node.getKey()) {
			return;
		}
	}

	/**
	 * @param root Contains root node of binary tree
	 * Prints the binary tree
	 */
	public static void printBinaryTree(BinaryNode root) {
		if (root == null) {
			System.out.println("Tree is empty");
		}
		System.out.println(" " + root.getKey() + " ");
		if (root.getLeft() != null) {
			BinaryNode left = (BinaryNode) root.getLeft();
			printBinaryTree(left);
		}
		if (root.getRight() != null) {
			BinaryNode right = (BinaryNode) root.getRight();
			printBinaryTree(right);
		}
	}
	
	/**
	 * @param node Contains root node of binary tree
	 * @return Returns size of binary tree
	 */
	public static int size(BinaryNode node) {
		if(node == null)
			return 0;
		else
			return (size((BinaryNode) node.getLeft()) + size((BinaryNode) node.getRight()) + 1);
	}
	
	/**
	 * @param key Contains value to be searched
	 * @param node Contains head node to binary tree
	 * @return Returns true if value is found
	 */
	public static <K> boolean searchKey(K key, BinaryNode node) {
		if (node == null)
			return false;
		if (key == node.getKey()) {
			flag = 1;
			return true;
		}
		int result;
		if ((int)key>(int)node.getKey())
			result = -1;
		else
			result = 1;
		if (result == -1) {
			BinaryNode right = (BinaryNode) node.getRight();
			searchKey(key, right);
		}
		if (result == 1) {
			BinaryNode left = (BinaryNode) node.getLeft();
			searchKey(key, left);
		}
		return (flag==1)?true:false;
	}
	
	int size() {
		return size(root);
	}

	/**
	 * @param <K>
	 * @param node Contains node to be compared
	 * @param root Contains node to be compared
	 * @return Returns 0 for equal, 1 or -1 for greater than or lesser than conditions
	 */
	public static <K> int compareTo(BinaryNode node, BinaryNode root) {
		if (node.getKey() == root.getKey())
			return 0;
		if ((int)node.getKey() > (int)root.getKey())
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		
		root.setKey(56);
		
		BinaryNode newNode1 = new BinaryNode();
		newNode1.setKey(70);
		addBinaryNode(newNode1, root);
		
		BinaryNode newNode2 = new BinaryNode();
		newNode2.setKey(30);
		addBinaryNode(newNode2, root);
		
		BinaryNode newNode3 = new BinaryNode();
		newNode3.setKey(22);
		addBinaryNode(newNode3, root);
		
		BinaryNode newNode4 = new BinaryNode();
		newNode4.setKey(40);
		addBinaryNode(newNode4, root);
		
		BinaryNode newNode5 = new BinaryNode();
		newNode5.setKey(60);
		addBinaryNode(newNode5, root);
		
		BinaryNode newNode6 = new BinaryNode();
		newNode6.setKey(95);
		addBinaryNode(newNode6, root);
		
		BinaryNode newNode7 = new BinaryNode();
		newNode7.setKey(11);
		addBinaryNode(newNode7, root);
		
		BinaryNode newNode8 = new BinaryNode();
		newNode8.setKey(3);
		addBinaryNode(newNode8, root);
		
		BinaryNode newNode9 = new BinaryNode();
		newNode9.setKey(16);
		addBinaryNode(newNode9, root);
		
		BinaryNode newNode10 = new BinaryNode();
		newNode10.setKey(65);
		addBinaryNode(newNode10, root);
		
		BinaryNode newNode11 = new BinaryNode();
		newNode11.setKey(63);
		addBinaryNode(newNode11, root);

		BinaryNode newNode12 = new BinaryNode();
		newNode12.setKey(67);
		addBinaryNode(newNode12, root);
//		printBinaryTree(root);
		System.out.println(size(root));
		System.out.println(searchKey(68, root));
	}

}
