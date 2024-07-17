// 56. Write a program to implement a node structure for singly linked list. Read the 
// data in a node, print the node
public class P_56 {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node first = null;

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

    public void printList() {
        if (first == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.link;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        P_56 list = new P_56();
        list.insertAtfirst(30);
        list.insertAtfirst(20);
        list.insertAtfirst(10);

        list.printList();
    }
}
