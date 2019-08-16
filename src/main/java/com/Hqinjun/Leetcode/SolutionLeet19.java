package java.com.Hqinjun.Leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class SolutionLeet19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int length = 0;
        while (node!=null){
            length++;
            node = node.next;
        }
        System.out.println(length);
        node.next = head;
        while (node!=null&& length-n>=0){
            length--;
            node=node.next;
        }
        node.next= node.next.next;
        return head;
    }

    public static void main(String[] args) {
        System.out.println("22");
    }
}
