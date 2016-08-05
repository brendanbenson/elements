import binarytree.BinaryTreeNode;

public class BinaryTreeUtils {
    public Boolean isSymmetric(BinaryTreeNode tree) {
        return isReverse(tree.left, tree.right);
    }

    public Boolean isReverse(BinaryTreeNode left, BinaryTreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return (left.data == right.data)
                && isReverse(left.left, right.right)
                && isReverse(left.right, right.left);
    }
}
