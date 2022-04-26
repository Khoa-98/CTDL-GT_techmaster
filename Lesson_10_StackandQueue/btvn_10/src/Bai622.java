public class Bai622 {


    class MyCircularQueue {
        int[] arr;
        int SIZE;
        int headIndex;
        int tailIndex;
        int count; // so phan tu hien tai cua mang

        public MyCircularQueue(int k) {
            SIZE = k;
            arr = new int[SIZE];
            headIndex = tailIndex = -1;
            count = 0;
        }

        public boolean enQueue(int value) {
            if (isFull() == true) {
                return false;
            }
            tailIndex++;
            if (tailIndex == SIZE) {
                tailIndex = 0;
            }
            if (isEmpty() == true) {
                headIndex = tailIndex;
            }
            arr[tailIndex] = value;
            count++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty() == true) {
                return false;
            }
            headIndex++;
            if (headIndex == SIZE) {
                headIndex = 0;
            }
            count--;
            return true;

        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return arr[headIndex];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return arr[tailIndex];
        }

        public boolean isEmpty() {
            return count <= 0;
        }

        public boolean isFull() {
            return count >= SIZE;
        }

    }
}

