public class Bai707 {


    public MyNode head;

    public Bai707() {

    }

    public int get(int index) {
        int count = -1;
        MyNode iNode = this.head;
        while (iNode != null) {
            count++;
            if (count == index) {
                return iNode.val;
            }
            iNode = iNode.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        MyNode newHead = new MyNode(val);
        newHead.next = this.head;
        this.head = newHead;
    }

    // them ptu vao cuoi linkedlist
    public void addAtTail(int val) {
        MyNode newNode = new MyNode(val);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        MyNode lastNode = this.head;
        while (lastNode != null) {
            if (lastNode.next == null) { // lastNode is lastNode
                lastNode.next = newNode;
                break;
            }

            lastNode = lastNode.next;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        } else {
            // B1: tim vi tri can add
            MyNode newNode = new MyNode(val);
            MyNode curNode = this.head;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    // thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
    }

    public void deleteAtIndex(int index) {

        if (this.head == null || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        MyNode curNode = this.head;
        MyNode prevNode = null;
        int count = 0;
        while (curNode != null) {
            if (count == index) {
                prevNode.next = curNode.next; // delete curent Node
                break;
            }

            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }
    }

    public class MyNode {
        public int val;
        public MyNode next;

        public MyNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return this.val + "";
        }
    }
}
