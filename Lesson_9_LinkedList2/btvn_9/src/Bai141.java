public class Bai141 {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        int step = 2;
        ListNode iNode = head;
        ListNode jNode = head.next;

        while (iNode != null) {
            int count = 0;

            while (jNode != null) {
                if (iNode == jNode) {
                    return true;
                }
                jNode = jNode.next;
                count++;

                if (count == step) {
                    break;
                }

            }
            iNode = iNode.next;
        }


        return false;
    }
}
