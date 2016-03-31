package algorithms.implementation;

/**
 * Created by Monil on 3/13/16.
 */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class AddNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;

        if (l2 == null) {
            return l1;
        }

        String str1 = "";
        while(l1 != null) {
            str1 += l1.val;
            l1 = l1.next;
        }

        String str2 = "";
        while(l2 != null) {
            str2 += l2.val;
            l2 = l2.next;
        }

        long num1 = Long.parseLong(new StringBuilder(str1).reverse().toString());
        long num2 = Long.parseLong(new StringBuilder(str2).reverse().toString());

        long res = num1 + num2;

        System.out.println("***"+num1);
        System.out.println("***"+num2);
        System.out.println("***"+res);

        if (res == 0)
            return new ListNode(0);

        ListNode head = null, current = null;

        while(res > 0) {
            int rem = (int) (res % 10);
            ListNode l = new ListNode(rem);
            if (head == null) {
                head = l;
                current = l;
            } else {
                current.next = l;
                current = l;
            }
            // current = current.next;
            res /= 10;
            printList(head);
        }

        return head;
    }

    public static void printList(ListNode l) {
        while(l != null) {
            System.out.print(l.val + "->");
            l = l.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);

        ListNode l = l2;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l.next = new ListNode(9);
        l = l.next;

        l = addTwoNumbers(l1, l2);

        while(l != null) {
            System.out.print(l.val + "->");
            l = l.next;
        }

    }

}


