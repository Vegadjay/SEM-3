// 60. Write a program to implement stack using singly linked list
public class P_60 {
    public class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node first = null;

    public void push(int data) {
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

    public void pop() {
        if (first == null) {
            System.out.println("Stack is Underflow");
            return;
        }
        first = first.link;
    }

    public void print() {
        if (first == null) {
            System.out.println("Stack is Empty....");
            return;
        }
        System.out.println("first");
        Node currNode = first;
        while (currNode != null) {
            System.out.println(currNode.info);
            System.out.println("----");
            currNode = currNode.link;
        }
    }

    public static void main(String[] args) {
        P_60 stack = new P_60();
        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.push(50);
        stack.push(40);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        System.out.println("This is reverse");
        stack.print();
    }
}