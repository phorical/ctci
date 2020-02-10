package ctci.linkedLists;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestKthToLastNode {

    @DataProvider(name = "list")
    public Object[][] provider() {
        Node head = new Node(0);
        for (int i = 1; i <= 10; i++) {
            head.appendToTail(i);
        }
        return new Object[][]{{head, 0, 10}, {head, 1, 9}, {head, 2, 8}, {head, 3, 7}, {head, 4, 6}, {head, 5, 5}, {head, 6, 4}, {head, 7, 3}, {head, 8, 2}, {head, 9, 1}, {head, 10, 0}};
    }

    @Test(dataProvider = "list")
    public void testKthToLastNode(Node head, int k, int answer) {
        Assert.assertEquals(KthToLastNode.kthToLastNode(head, k).data, answer);
    }
}
