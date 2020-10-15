
package com.linkedList;

public class BinaryNode<K> implements NodeIntfc {
	
	private K key;
	private NodeIntfc left;
	private NodeIntfc right;

	@Override
	public K getKey() {
		return this.key;
	}
	
	public void Node(K key) {
		this.key = key;
	}
	
	public BinaryNode Node() {
		return new BinaryNode();
	}

	@Override
	public NodeIntfc getLeft() {
		return left;
	}

	@Override
	public void setLeft(NodeIntfc left) {
		this.left = left;
	}

	@Override
	public NodeIntfc getRight() {
		return right;
	}

	@Override
	public void setRight(NodeIntfc right) {
		this.right = right;
	}

//	@Override
//	public void setKey(K key) {
//		this.key = key;
//	}

	@Override
	public void setKey(Object key) {
		this.key = (K) key;
	}


}