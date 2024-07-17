// 61. Write a program to implement queue using singly linked list.
public class P_61 {
    public class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void push(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;

        while (temp.link != null) {
            temp = temp.link;
        }

        temp.link = newNode;
    }

    public void pop() {
        if (first == null) {
            System.out.println("Link is empty");
            return;
        }
        first = first.link;
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
    }

    public static void main(String[] args) {
        P_61 queue = new P_61();
        queue.push(30);
        queue.push(20);
        queue.push(10);
        queue.push(130);

        queue.print();
    }
}
