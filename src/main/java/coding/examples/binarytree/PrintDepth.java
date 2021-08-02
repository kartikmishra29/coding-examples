package coding.examples.binarytree;

import coding.examples.model.BinarTreeNode;

public class PrintDepth {

	public int depth(BinarTreeNode root) {

		if (root == null)
			return 0;

		int leftDepth = depth(root.getLeft());

		int rightDepth = depth(root.getRight());

		return Math.max(leftDepth, rightDepth) + 1;
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
		node2.left(node4).right(node5);
		node3.left(node6).right(node7);

		PrintDepth view = new PrintDepth();
		System.out.println(view.depth(node1));
	}
}