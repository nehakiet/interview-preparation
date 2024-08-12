public class SinglyLL {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    private void printNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SinglyLL linkedList = new SinglyLL();
        linkedList.head = new Node(7);
        Node second = new Node(4);
        Node third = new Node(5); //ll created but they aren't associated with each other
        linkedList.head.next = second;
        second.next = third;
        linkedList.printNode();
    }
}
