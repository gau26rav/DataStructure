package geeks.day9.BST;

public class BinarySearchTree {
	Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 8, 4, 2, 1, 6, 7, 8, 9 };
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(6);

		for (int value : arr)
			tree.root = insertInBinaryTree(tree.root, value);
		print(tree.root);
	}

	public static Node insertInBinaryTree(Node node, int data) {
		if (node == null)
			return node = new Node(data);

		if (data < node.data)
			node.left = insertInBinaryTree(node.left, data);
		else if (data > node.data)
			node.right = insertInBinaryTree(node.right, data);
		return node;
	}

	public static void print(Node node) {
		if (node == null)
			return;

		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);

	}
}
