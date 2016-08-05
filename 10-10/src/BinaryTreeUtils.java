import binarytree.BinaryTreeNode;

import java.util.List;

public class BinaryTreeUtils {
    public BinaryTreeNode<Integer> reconstruct(List<Integer> inorder, List<Integer> preorder) {
        if (preorder.isEmpty()) {
            return null;
        }

        int i = inorder.indexOf(preorder.get(0));

        if (i == -1) {
            return null;
        }

        return new BinaryTreeNode<>(
                preorder.get(0),
                reconstruct(
                        inorder.subList(0, i),
                        preorder.subList(1, preorder.size())
                ),
                reconstruct(
                        inorder.subList(i + 1, inorder.size()),
                        preorder.subList(i + 1, preorder.size())
                )
        );
    }
}
