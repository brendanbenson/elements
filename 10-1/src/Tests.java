import binarytree.BinaryTreeNode;

import static testutils.TestUtils.assertFalse;
import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        BinaryTreeBalancer binaryTreeBalancer = new BinaryTreeBalancer();

        BinaryTreeNode<Integer> unbalancedTree =
                new BinaryTreeNode<>(
                        5,
                        new BinaryTreeNode<>(
                                4,
                                new BinaryTreeNode<>(
                                        3,
                                        null,
                                        null
                                ),
                                null
                        ),
                        null
                );

        assertFalse(binaryTreeBalancer.isBalanced(unbalancedTree));

        BinaryTreeNode<Integer> balancedTree =
                new BinaryTreeNode<>(
                        5,
                        new BinaryTreeNode<>(
                                4,
                                new BinaryTreeNode<>(
                                        3,
                                        null,
                                        null
                                ),
                                null
                        ),
                        new BinaryTreeNode<>(
                                6,
                                null,
                                null
                        )
                );

        assertTrue(binaryTreeBalancer.isBalanced(balancedTree));
    }
}
