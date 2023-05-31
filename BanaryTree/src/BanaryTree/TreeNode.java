package BanaryTree;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int _data) {
		data = _data;
		left = right = null;
	}

	public TreeNode(int _data, TreeNode _left, TreeNode _right) {
		data = _data;
		left = _left;
		right = _right;
	}
}
