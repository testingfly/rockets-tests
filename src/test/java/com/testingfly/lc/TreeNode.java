package com.testingfly.lc;

public class TreeNode {

	int val;
	TreeNode left, right;

	TreeNode(int data) {
		this.val = data;
		this.left = null;
		this.right = null;

	}

	// Function to insert nodes in level order
	public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
		// Base case for recursion
		if (i < arr.length) {
			TreeNode temp = new TreeNode(arr[i]);
			root = temp;

			// insert left child
			root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

			// insert right child
			root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
		}
		return root;
	}

	// Function to print tree nodes in InOrder fashion
	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.val + " ");
			inOrder(root.right);
		}
	}

	// Driver program to test above function
	public static void main(String args[]) {
		TreeNode t = new TreeNode(0);
		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
		t = t.insertLevelOrder(arr, t, 0);
		t.inOrder(t);
	}
}