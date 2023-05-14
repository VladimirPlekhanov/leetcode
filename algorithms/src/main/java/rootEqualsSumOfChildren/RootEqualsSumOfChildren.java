package rootEqualsSumOfChildren;

public class RootEqualsSumOfChildren {

    // Constant complexity - O(1)

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

}
