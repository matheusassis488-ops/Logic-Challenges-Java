class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    private int check(TreeNode root) {
        if(root == null) {return 0;}

        int left = check(root.left);
        if(left == -1) {return -1;}

        int right = check(root.right);
        if(right == -1) {return -1;}

        if((left - right) > 1 || (left - right) < -1) {return -1;}

        if(left > right) {return left + 1;}
        return right + 1;
    }
}
