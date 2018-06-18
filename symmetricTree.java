public class symmetricTree {
    public static void main(String[] args){
        TreeNode r = new TreeNode(2);
        isSymmetric(r);
    }
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }
    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null && right != null || right == null && left != null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
