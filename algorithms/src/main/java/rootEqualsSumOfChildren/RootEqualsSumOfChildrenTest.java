package rootEqualsSumOfChildren;

import org.junit.Assert;
import org.junit.Test;

public class RootEqualsSumOfChildrenTest {

    private final TreeNode root = new TreeNode(10, new TreeNode(4), new TreeNode(6));
    RootEqualsSumOfChildren r = new RootEqualsSumOfChildren();

    @Test
    public void rootEqualsSumOfChildrenTest() {
        boolean actualResult = r.checkTree(root);
        Assert.assertTrue(actualResult);
    }

}
