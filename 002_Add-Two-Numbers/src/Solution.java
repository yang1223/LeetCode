/**
 * Created by Yang Chi-Chang on 2016/10/6.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode result = head;
        ListNode node1 = l1;
        ListNode node2 = l2;
        boolean carry = false;
        while (node1 != null || node2 != null || carry) {
            int val1;
            int val2;
            if (node1 == null) val1 = 0;
            else val1 = node1.val;
            if (node2 == null) val2 = 0;
            else val2 = node2.val;

            if (carry) {
                if (val1 + val2 < 9) {
                    result.next = new ListNode(val1 + val2 + 1);
                    carry = false;
                } else {
                    result.next = new ListNode(val1 + val2 + 1 - 10);
                    carry = true;
                }
            } else {
                if (val1 + val2 < 10) {
                    result.next = new ListNode(val1 + val2);
                    carry = false;
                } else {
                    result.next = new ListNode(val1 + val2 - 10);
                    carry = true;
                }
            }
            result = result.next;
            if (node1 != null) node1 = node1.next;
            if (node2 != null) node2 = node2.next;
        }
        head = head.next;
        return head;
    }
}
