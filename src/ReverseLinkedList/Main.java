package ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode elem1 = new ListNode(2);
        ListNode elem2 = new ListNode(3);
        ListNode elem3 = new ListNode(4);
        ListNode elem4 = new ListNode(5);

        head.next = elem1;
        elem1.next = elem2;
        elem2.next = elem3;
        elem3.next = elem4;
        elem4.next = null;

        Solution solution = new Solution();
        ListNode listNode = solution.reverseList(head);

        System.out.println("Result: ");
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}
