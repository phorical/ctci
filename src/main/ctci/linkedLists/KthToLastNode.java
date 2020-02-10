package ctci.linkedLists;

public class KthToLastNode {

    public static Node kthToLastNode(Node head, int k) {
        Node fast = head;
        for (int i = 0; i < k; i++) {
            if ( fast.next == null ) {
                return null;
            }
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            head = head.next;
        }
        return head;
    }

}
