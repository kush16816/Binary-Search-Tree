package com.linkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryNodeTest {

	static BinarySearchTree<Comparable> tree = new BinarySearchTree<>();
	static BinaryNode root;
	@BeforeClass public static void BinaryTree() {
		
		root = new BinaryNode();
		root.setKey(56);
		
		BinaryNode newNode1 = new BinaryNode();
		newNode1.setKey(70);
		tree.addBinaryNode(newNode1, root);
		
		BinaryNode newNode2 = new BinaryNode();
		newNode2.setKey(30);
		tree.addBinaryNode(newNode2, root);
		
		BinaryNode newNode3 = new BinaryNode();
		newNode3.setKey(22);
		tree.addBinaryNode(newNode3, root);
		
		BinaryNode newNode4 = new BinaryNode();
		newNode4.setKey(40);
		tree.addBinaryNode(newNode4, root);
		
		BinaryNode newNode5 = new BinaryNode();
		newNode5.setKey(60);
		tree.addBinaryNode(newNode5, root);
		
		BinaryNode newNode6 = new BinaryNode();
		newNode6.setKey(95);
		tree.addBinaryNode(newNode6, root);
		
		BinaryNode newNode7 = new BinaryNode();
		newNode7.setKey(11);
		tree.addBinaryNode(newNode7, root);
		
		BinaryNode newNode8 = new BinaryNode();
		newNode8.setKey(3);
		tree.addBinaryNode(newNode8, root);
		
		BinaryNode newNode9 = new BinaryNode();
		newNode9.setKey(16);
		tree.addBinaryNode(newNode9, root);
		
		BinaryNode newNode10 = new BinaryNode();
		newNode10.setKey(65);
		tree.addBinaryNode(newNode10, root);
		
		BinaryNode newNode11 = new BinaryNode();
		newNode11.setKey(63);
		tree.addBinaryNode(newNode11, root);

		BinaryNode newNode12 = new BinaryNode();
		newNode12.setKey(67);
		tree.addBinaryNode(newNode12, root);
	}

	@Test
	public void testSizeOfTree() {
		assertEquals(13, tree.size(root));
	}
	
	@Test
	public void testSearchForKeyTrue() {
		assertEquals(true, tree.searchKey(63, root));
	}
	
	@Test
	public void testSearchForKeyFalse() {
		boolean result = BinarySearchTree.searchKey(68, root);
		System.out.println(result);
		assertEquals(false, result);
	}

}
