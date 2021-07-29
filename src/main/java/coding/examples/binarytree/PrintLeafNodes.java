package coding.examples.binarytree;

import coding.examples.model.BinarTreeNode;

public class PrintLeafNodes {

	public void printLeafNodes(BinarTreeNode root) {

		if (root == null)
			return;

		if (root.getLeft() == null && root.getRight() == null)
			System.out.print(root.getData() + " ");

		printLeafNodes(root.getLeft());
		printLeafNodes(root.getRight());
	}

	public static void main(String[] args) {

		// Create tree
		BinarTreeNode node1 = new BinarTreeNode(1);
		BinarTreeNode node2 = new BinarTreeNode(2);
		BinarTreeNode node3 = new BinarTreeNode(3);
		BinarTreeNode node4 = new BinarTreeNode(4);
		BinarTreeNode node5 = new BinarTreeNode(5);
		BinarTreeNode node6 = new BinarTreeNode(6);
		BinarTreeNode node7 = new BinarTreeNode(7);

		node1.left(node2).right(node3);
		node3.left(node4);
		node4.left(node5).right(node6);
		node6.right(node7);

		PrintLeafNodes view = new PrintLeafNodes();
		view.printLeafNodes(node1);
	}
}