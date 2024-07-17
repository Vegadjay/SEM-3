import java.util.Scanner;

public class P_63 {

    static class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    static Node first = null;

    public static void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of node : ");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;

            while (temp.link != null) {
                temp = temp.link;
            }

            temp.link = newNode;
        }
    }

    public static void copy_List() {
        P_63 copyNode = new P_63();

        Node current = first;
        copyNode.first = new Node(current.info);
        Node newCurrent = copyNode.first;

        while (current.link != null) {
            current = current.link;
            newCurrent.link = new Node(current.info);
            newCurrent = newCurrent.link;
        }

        Node temp = copyNode.first;

        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P_63 n1 = new P_63();
        Boolean isTrue = true;

        while (isTrue) {
            n1.insert();

            System.out.println("Enter 1 for adding more ele: ");
            int ans = sc.nextInt();

            if (ans == 1) {
                isTrue = true;
            } else {
                isTrue = false;
            }
        }

        P_63 copyNode = new P_63();
        copyNode.copy_List();
    }
}