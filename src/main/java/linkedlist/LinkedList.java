package linkedlist;

public class LinkedList
{
    Node head = null;

    static class Node{
        private Integer data;
        private Node next;

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1 = insertNode(list1,1);
        list1 = insertNode(list1,2);
        list1 = insertNode(list1,3);
        list1 = insertNode(list1,4);
        list1 = insertNode(list1,5);

        LinkedList list2 = new LinkedList();
        list2 = insertNode(list2,6);
        list2 = insertNode(list2,7);
        list2 = insertNode(list2,8);
        list2 = insertNode(list2,9);
        list2 = insertNode(list2,10);

        LinkedList result = manipulate(list1,list2,2,5);
        System.out.println("Hello");
    }

    private static LinkedList manipulate(LinkedList list1, LinkedList list2, int a, int b) {
        Node currentNode1 = list1.head;
        Node currentNode2 = list2.head;

        boolean isProcessed = false;

        while(currentNode1.next!=null){
            if(currentNode1.data == a){
                isProcessed = true;
                while(currentNode1 != null && currentNode1.data != b){
                    deleteNode(currentNode1);
                    currentNode1 = currentNode1.next;
                }
                deleteNode(currentNode1);
            }
            else
                currentNode1 = currentNode1.next;
        }

        if(!isProcessed){
            while(currentNode2.next!=null){
                if(currentNode2.data == a){
                    while(currentNode2 != null && currentNode2.data != b){
                        deleteNode(currentNode2);
                        currentNode2 = currentNode2.next;
                    }
                    deleteNode(currentNode2);
                }
                else
                    currentNode2 = currentNode2.next;
            }
        }
        return append(list1,list2);
    }

    private static LinkedList append(LinkedList list1, LinkedList list2) {
        Node currentNode = list1.head;

        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next = list2.head;
        return list1;
    }

    private static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    private static LinkedList insertNode(LinkedList list, int data) {
        Node newNode = new Node(data,null);

        if(list.head == null)
            list.head = newNode;
        else{
            Node currentNode = list.head;

            while(currentNode.next != null)
                currentNode=currentNode.next;

            currentNode.next = newNode;
        }
        return list;
    }
}
