MinimumDepthOfBinaryTree

class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        return check(root);
    }

    private int check(TreeNode root) {
        if(root == null) {return 0;}
        if(root.left == null && root.right == null) {return 1;}
        if(root.left == null) {return check(root.right) + 1;}
        if(root.right == null) {return check(root.left) + 1;}

        return Math.min(check(root.left), check(root.right)) + 1;
    }
}
