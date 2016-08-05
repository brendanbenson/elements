import binarytree.BinaryTreeNode;

public class BinaryTreeBalancer {
    // Not correct - need to check height in addition to balanced status
    public Boolean isBalanced(BinaryTreeNode<Integer> binaryTreeNode) {
        if (binaryTreeNode.left == null && binaryTreeNode.right == null) {
            return true;
        }
        if (binaryTreeNode.left == null) {
            return binaryTreeNode.right.left == null &&
                    binaryTreeNode.right.left == null;
        }
        if (binaryTreeNode.right == null) {
            return binaryTreeNode.left.left == null &&
                    binaryTreeNode.left.left == null;
        }
        return isBalanced(binaryTreeNode.left) && isBalanced(binaryTreeNode.right);
    }
}
