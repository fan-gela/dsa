public class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class ReverseDigit {
    public static void main(String[] args) {
        ListNode nodeOne = new ListNode(3);
        nodeOne.next = new ListNode(2);
        nodeOne.next.next = new ListNode(1);

        ListNode nodeTwo = new ListNode(6);
        nodeTwo.next = new ListNode(5);
        nodeTwo.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(nodeOne, nodeTwo);
        printList(result);
    }

}

    public static ListNode addTwoNumbers(ListNode nodeOne, ListNode nodeTwo) {
        ListNode currentValue = new ListNode(0);
        int count = 0;

        while (nodeOne != null || nodeTwo != null) {
            int sum = count;

            if (nodeOne != null) {
                sum += nodeOne.value;
                nodeOne = nodeOne.next;
            }

            if (nodeTwo != null) {
                sum += nodeTwo.value;
                nodeTwo = nodeTwo.next;
            }

            currentValue.next = new ListNode(sum % 10);
            currentValue = currentValue.next;
            count = sum / 10;
        }

        if (count > 0) {
            currentValue.next = new ListNode(carry);
        }

        return currentValue.next;

        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.println(current.value + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }