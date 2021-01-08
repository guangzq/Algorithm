/**
 * 给定两个（单向）链表，判定它们是否相交并返回交点。请注意相交的定义基于节点的引用，而不是基于节点的值。
 * 换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null) return null;
//        ListNode nodeA = headA;
//        ListNode nodeB = headB;
//        while(nodeA != nodeB) {
//            nodeA =  nodeA == null ? headB : nodeA.next;
//            nodeB =  nodeB == null ? headA : nodeB.next;
//        }
//        return nodeA;
//    }
//}