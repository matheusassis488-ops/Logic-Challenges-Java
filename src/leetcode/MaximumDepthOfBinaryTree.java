class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {return 0;}

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        if(dLeft > dRight) {return dLeft + 1;}
        return dRight + 1;;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
