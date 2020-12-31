package com.pk.tutorial.tree;

public class TreeTester {

	public static void main(String[] args) {
		Node node = new Node(20);
		node.insert(12);
		node.insert(6);
		node.insert(22);
		node.insert(3);
		node.insert(7);
		node.insert(14);
		node.insert(33);

		System.out.println(node.contains(4));
		System.out.println(node.contains(22));

		System.out.println("inOrder: left,root,right");
		node.printInOrder();
		System.out.println("postOrder: left,right,root");
		node.printPostOrder();
		System.out.println("preOrder: root,left,right");
		node.printPreOrder();
	}
}
