package coding.examples.binarytree;

import coding.examples.model.BinarTreeNode;

public class PrintRightView {

	private int maxLevel = 0;

	public void printRightView(BinarTreeNode root, int level) {

		if (root == null)
			return;

		if (level > maxLevel) {
			System.out.print(root.getData() + " ");
			maxLevel = level;
		}

		printRightView(root.getRight(), level + 1);
		printRightView(root.getLeft(), level + 1);
	}

	public static void main(String[] args) {

		// Create tree
		BinarTreeNode node1 = new BinarTreeNode(1);
		BinarTreeNode node2 = new BinarTreeNode(2);
		BinarTreeNode node3 = new BinarTreeNode(3);
		BinarTreeNode node4 = new BinarTreeNode(4);
		BinarTreeNode node5 = new BinarTreeNode(5);
		BinarTreeNode node6 = new BinarTreeNode(6);

		node1.left(node2).right(node3);
		node3.left(node4);
		node4.left(node5).right(node6);

		PrintRightView view = new PrintRightView();
		view.printRightView(node1, 1);
	}
}