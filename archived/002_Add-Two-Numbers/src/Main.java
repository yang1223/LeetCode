/**
 * Created by Yang Chi-Chang on 2016/10/6.
 */
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode node = new Solution().addTwoNumbers(l1,l2);

        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);


    }
}
