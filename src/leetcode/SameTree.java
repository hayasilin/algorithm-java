package leetcode;

public class SameTree {
	
	public static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
			value = x;
			right = null;
			left = null;
		}
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (q == null || p == null) return false;
        if (p.value != q.value) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
	
	public static void main(String[] args) {
		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(2);
		System.out.println(isSameTree(p, q));		
	}
}
