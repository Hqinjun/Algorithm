package java.com.Hqinjun.Leetcode;


//解题思路时位数相加 大于10 进一
public class Solution_leet2 {


public ListNode addTwoNumbers_leet(ListNode l1, ListNode l2) {
ListNode dummyHead = new ListNode(0);
ListNode p = l1, q = l2, curr = dummyHead;
int carry = 0;
while (p != null || q != null) {
   int x = (p != null) ? p.val : 0;
   int y = (q != null) ? q.val : 0;
   int sum = carry + x + y;
   carry = sum / 10;
   curr.next = new ListNode(sum % 10);
   curr = curr.next;
   if (p != null) p = p.next;
   if (q != null) q = q.next;
}
if (carry > 0) {
   curr.next = new ListNode(carry);
}
return dummyHead.next;
}
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
int h = l1.val + l2.val;
int t = l1.next.val + l2.next.val;
int i = l1.next.next.val +l2.next.next.val;
ListNode listNode =new ListNode(0);
listNode.next =new ListNode(0);
listNode.next.next =new ListNode(0);
if (h >= 10)
{
   t =t+1;
}
if(t >= 10){
   i=i+1;
}
listNode.val = h%10;
listNode.next.val = t%10;
listNode.next.next.val = i;
return listNode;
}

}
