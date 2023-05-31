package BanaryTree;

public class BanaryTree {
	public TreeNode root;

	public void Input() {
		TreeNode A = new TreeNode(2, new TreeNode(5), null);
		TreeNode B = new TreeNode(4, new TreeNode(7), new TreeNode(1));
		root = new TreeNode(3, A, B);
	}

	// Tiền tự
	public void TienTu(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.data + " ");
			TienTu(tree.left);
			TienTu(tree.right);
		}
	}

	public void Print_TienTu() {
		TienTu(root);
	}

	// Trung tự
	public void TrungTu(TreeNode tree) {
		if (tree != null) {
			TrungTu(tree.left);
			System.out.print(tree.data + " ");
			TrungTu(tree.right);
		}
	}

	public void Print_TrungTu() {
		TrungTu(root);
	}

	// Hậu tự
	public void HauTu(TreeNode tree) {
		if (tree != null) {
			HauTu(tree.left);
			HauTu(tree.right);
			System.out.print(tree.data + " ");
		}
	}

	public void Print_HauTu() {
		HauTu(root);
	}

	public static void main(String[] args) {
		BanaryTree banaryTree = new BanaryTree();
		banaryTree.Input();
		banaryTree.Print_TienTu();
		System.out.println();
		banaryTree.Print_TrungTu();
		System.out.println();
		banaryTree.Print_HauTu();
	}
}
