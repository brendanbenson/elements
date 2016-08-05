import binarytree.BinaryTreeNode;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        BinaryTreeUtils binaryTreeUtils = new BinaryTreeUtils();

        BinaryTreeNode<Integer> expected = new BinaryTreeNode<>(8,
                new BinaryTreeNode<>(
                        2,
                        new BinaryTreeNode<>(6),
                        new BinaryTreeNode<>(
                                5,
                                new BinaryTreeNode<>(1),
                                null

                        )
                ),
                new BinaryTreeNode<>(
                        3,
                        null,
                        new BinaryTreeNode<>(
                                4,
                                null,
                                new BinaryTreeNode<>(
                                        7,
                                        new BinaryTreeNode<>(9),
                                        null
                                )
                        )
                )
        );

        assertEqual(binaryTreeUtils.reconstruct(
                asList(6, 2, 1, 5, 8, 3, 4, 9, 7),
                asList(8, 2, 6, 5, 1, 3, 4, 7, 9)
        ), expected);
    }
}
