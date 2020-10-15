package com.linkedList;

public interface NodeIntfc<K> {
	
	K getKey();
	
	NodeIntfc getLeft();
	void setLeft(NodeIntfc left);
	
	NodeIntfc getRight();
	void setRight(NodeIntfc right);
	void setKey(K key);

}
