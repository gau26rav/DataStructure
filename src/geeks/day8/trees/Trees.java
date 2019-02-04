package geeks.day8.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {

	private Node root;

	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root = populateTree(null);
		printTree(root);
		System.out.println("\nTotal Number of nodes = " + countNode(root));
		System.out.println("Height of tree = " + height(root));
		printLevelOrder(root);
	}

	/**
	 * Calculate the Number of nodes (also called as size of tree) Count(node) =
	 * count(lnode) + count(rnode) + 1(for the element itself)
	 * 
	 * @param node
	 * @return
	 */
	public static int countNode(Node node) {
		if (node == null)
			return 0;
		int lcount = countNode(node.left);
		int rcount = countNode(node.right);
		return lcount + rcount + 1;
	}

	public static int height(Node node) {
		if (node == null)
			return 0;
		int lheight = height(node.left);
		int rheight = height(node.right);
		// Addition of 1 is to accommodate the height of element itself
		return Math.max(lheight, rheight) + 1;
	}

	boolean isBalanced(Node root) {
		if (root == null)
			return true;
		boolean condition = Math.abs(height(root.left) - height(root.right)) <= 1;
		if (!condition)
			return false;
		return condition && isBalanced(root.left) && isBalanced(root.right);
	}

	/*
	 * int height(Node node){ if(node == null) return 0; return
	 * Math.max(height(node.left), height(node.right)) + 1; }
	 */

	public static int countLeafs(Node node, int count) {
		if (node == null)
			return count;
		/*
		 * if(node.left == null && node.right== null) return 1;
		 */
		++count;
		System.out.println(node.data + " " + count);

		int leftCount = countLeafs(node.left, count);
		int rightCount = countLeafs(node.right, count);
		return leftCount + rightCount;
	}

	public static boolean printAncestors(Node node, int x) {
		if (node == null)
			return false;

		if (node.data == x)
			return true;

		boolean lnode = printAncestors(node.left, x);
		if (lnode == true)
			System.out.print(node.data + " ");
		boolean rnode = printAncestors(node.right, x);
		if (rnode == true)
			System.out.print(node.data + " ");
		return lnode || rnode;
	}

	boolean hasPathSum(Node node, int sum) {
		if (node == null)
			return (sum == 0);
		if (sum - node.data == 0 && node.left == null && node.right == null)
			return true;

		boolean l1 = false, r1 = false;
		if (node.left != null)
			l1 = hasPathSum(node.left, sum - node.data);
		if (node.right != null)
			r1 = hasPathSum(node.right, sum - node.data);
		return r1 || l1;
	}

	public static Node populateTree(Node node) {
		Trees tree = new Trees();
		Node node1 = new Node(1);
		tree.root = node1;
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		node1.left = node2;
		node1.right = node3;
		node2.left = new Node(4);
		node2.right = new Node(5);
		node3.left = new Node(6);
		node3.right = new Node(7);

		return node1;
	}

	public static void printLevelOrder(Node node) {
		Queue<Node> tree = new LinkedList<>();
		if (node == null)
			return;
		tree.add(node);
		tree.add(null);
		Node curr;
		while (!tree.isEmpty()) {
			curr = tree.poll();
			if(tree.isEmpty() && curr==null)
				break;
			if(curr== null ){
			    tree.add(null);
			     System.out.print("$ ");
			     continue;
			}
			System.out.print(curr.data+ " ");
			
			if (curr.left != null)
				tree.add(curr.left);
			if (curr.right != null)
				tree.add(curr.right);
           
		}System.out.print("$ ");
	}

	public static void printTree(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		printTree(node.left);
		printTree(node.right);
	}

	boolean checkChildSum(Node node) {
		if (node == null)
			return false;

		return false;
	}
}
