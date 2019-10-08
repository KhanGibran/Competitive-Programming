package problems.leetcode;

public class ReverseLinkedList
{
    private LinkedListNode head;

    public ReverseLinkedList() {
        this.head = null;
    }

    private LinkedListNode reverseList(LinkedListNode head){
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        LinkedListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    private void deleteNode(LinkedListNode node){
        if(node.next!=null){
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    private void printList(LinkedListNode head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.head = new LinkedListNode(85);
        linkedList.head.next = new LinkedListNode(15);
        linkedList.head.next.next = new LinkedListNode(4);
        linkedList.head.next.next.next = new LinkedListNode(20);
    }
}
