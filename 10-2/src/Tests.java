import binarytree.BinaryTreeNode;
import testutils.TestUtils;

import static testutils.TestUtils.assertEqual;
import static testutils.TestUtils.assertFalse;
import static testutils.TestUtils.assertTrue;

public class Tests {
    public static void main(String[] args) throws Exception {
        BinaryTreeUtils binaryTreeUtils = new BinaryTreeUtils();

        BinaryTreeNode<Integer> first = new BinaryTreeNode<>(1, null, null);

        assertTrue(binaryTreeUtils.isSymmetric(first));



        BinaryTreeNode<Integer> second = new BinaryTreeNode<>(314,
                new BinaryTreeNode<>(
                        6,
                        null,
                        new BinaryTreeNode<>(
                                2,
                                null,
                                new BinaryTreeNode<>(3, null, null)
                        )
                ),
                new BinaryTreeNode<>(
                        6,
                        new BinaryTreeNode<>(
                                2,
                                new BinaryTreeNode<>(3, null, null),
                                null
                        ),
                        null
                )
        );

        assertTrue(binaryTreeUtils.isSymmetric(second));



        BinaryTreeNode<Integer> third = new BinaryTreeNode<>(314,
                new BinaryTreeNode<>(
                        6,
                        null,
                        new BinaryTreeNode<>(
                                561,
                                null,
                                new BinaryTreeNode<>(3, null, null
                                )
                        )
                ),
                new BinaryTreeNode<>(
                        6,
                        new BinaryTreeNode<>(
                                2,
                                new BinaryTreeNode<>(1, null, null),
                                null
                        ),
                        null
                )
        );

        assertFalse(binaryTreeUtils.isSymmetric(third));



        BinaryTreeNode<Integer> fourth = new BinaryTreeNode<>(314,
                new BinaryTreeNode<>(
                        6,
                        null,
                        new BinaryTreeNode<>(
                                2,
                                null,
                                new BinaryTreeNode<>(3, null, null)
                        )
                ),
                new BinaryTreeNode<>(
                        6,
                        new BinaryTreeNode<>(
                                2,
                                null,
                                null
                        ),
                        null
                )
        );

        assertFalse(binaryTreeUtils.isSymmetric(fourth));
    }
}
