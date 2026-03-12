 class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {return false;}
        if(root.left == null && root.right == null) {return root.val == targetSum;}

        int diference = targetSum - root.val;

        return hasPathSum(root.left, diference) ||
        hasPathSum(root.right, diference);
    }
}
