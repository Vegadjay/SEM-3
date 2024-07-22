// Write a program to reverse a linked list.
public class P_64 {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    // todo: Make methods and finish programme;

    public void insertAtfirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;
        first = newNode;
        newNode.link = temp;
    }

    public void insertAtlast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newNode;
    }

    public void reverseList() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        Node next;
        Node pred = null;

        while (save != null) {
            next = save.link;
            save.link = pred;
            pred = save;
            save = next;
        }
        first = pred;
    }

    public void print() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + "->");
            temp = temp.link;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        P_64 list = new P_64();
        list.insertAtfirst(20);
        list.insertAtfirst(90);
        list.insertAtfirst(40);
        list.insertAtfirst(20);
        list.insertAtfirst(10);
        list.print();
        System.out.println();
        list.reverseList();
        list.print();
    }
}
