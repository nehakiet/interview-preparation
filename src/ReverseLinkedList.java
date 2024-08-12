public class ReverseLinkedList {

    static Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --  ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node reverseList(Node head) {
        Node prev = head.next;
        Node next = head.next.next;
        head.next = null;

        while(prev !=null) {
            prev.next=head;
            head = prev;
            prev = next;
            if(next !=null)
                next = next.next;
        }
        return head;
    }



    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // creating and inserting node data
        ReverseLinkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Connection of Nodes
        ReverseLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ReverseLinkedList.printNode();
        ReverseLinkedList.head = ReverseLinkedList.reverseList(ReverseLinkedList.head);
        ReverseLinkedList.printNode();
    }



}
