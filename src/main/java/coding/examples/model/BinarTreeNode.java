package coding.examples.model;

public class BinarTreeNode {

	private int data;
	private BinarTreeNode left;
	private BinarTreeNode right;

	public BinarTreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinarTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinarTreeNode left) {
		this.left = left;
	}

	public BinarTreeNode getRight() {
		return right;
	}

	public void setRight(BinarTreeNode right) {
		this.right = right;
	}

	public BinarTreeNode left(BinarTreeNode left) {
		this.left = left;
		return this;
	}

	public BinarTreeNode right(BinarTreeNode right) {
		this.right = right;
		return this;
	}

	public BinarTreeNode data(int data) {
		this.data = data;
		return this;
	}
}
