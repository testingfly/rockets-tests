package com.testingfly.lc;

/**
 * 
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two 
 * trees are overlapped while the others are not.

	You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node 
	values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
	
	Example 1:
	
	Input: 
		Tree 1                     Tree 2                  
	          1                         2                             
	         / \                       / \                            
	        3   2                     1   3                        
	       /                           \   \                      
	      5                             4   7                  
	Output: 
	Merged tree:
		     3
		    / \
		   4   5
		  / \   \ 
		 5   4   7
 

Note: The merging process must start from the root nodes of both trees.
 *
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) { 
		val = x; 
	}
}

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	
    	TreeNode head;
    	if(t1==null && t2 == null) return null;
    	
    	if(t1==null)
    		t1 = new TreeNode(0);
    	
    	if(t2==null)
    		t2 = new TreeNode(0);
    	
    	head = new TreeNode(t1.val+ t2.val);
    	head.left = mergeTrees(t1.left, t2.left);
    	head.right = mergeTrees(t1.right, t2.right);
    	
    	return head;
    }
    


}