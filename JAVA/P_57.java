import java.util.Scanner;

public class P_57 {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;
        first = newNode;
        first.link = temp;
    }

    public void insertAtlast(int data) {
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

    public void delete(int data) {
        if (first == null) {
            System.out.println("LinkList is Null");
            return;
        }
        Node save = first, pred = null;
        if (save.data == data) {
            save = save.link;
        }
        while (save.link != null && save.data != data) {
            pred = save;
            save = save.link;
        }

        if (save == null) {
            System.out.println("Node not found");
        }

        pred.link = save.link;
    }

    public void deteleAtfirst() {
        if (first == null) {
            System.out.println("List is empty.....");
            return;
        }
        first = first.link;
    }

    public void deleteAtLast() {
        Node secondLast = first;
        Node lastnode = first.link;

        if (first == null) {
            System.out.println("List is empty..........");
            return;
        }

        if (first.link == null) {
            first = null;
            return;
        }

        while (lastnode.link != null) {
            lastnode = lastnode.link;
            secondLast = secondLast.link;
        }

        secondLast.link = null;

    }

    public void printList() {
        if (first == null) {
            System.out.println("List is empty");
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.link;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P_57 list = new P_57();
        while (true) {
            System.out.println(
                    "Enter 1 for insert at first position \n Enter 2 for insert at last position \n Enter 3 for delete at first position\n Enter 4 for delete at last position \n Enter 5 for delete when you enter number \n Enter 6 for print list \n Enter 7 for return");
            int num = sc.nextInt();
            if (num == 7) {
                break;
            }
            switch (num) {
                case 1:
                    System.out.print("Enter number: ");
                    int data = sc.nextInt();
                    list.insertAtFirst(data);
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    int data1 = sc.nextInt();
                    list.insertAtlast(data1);
                    break;
                case 3:
                    list.deteleAtfirst();
                    break;
                case 4:
                    list.deleteAtLast();
                    break;
                case 5:
                    System.out.println("Enter data :");
                    int data2 = sc.nextInt();
                    list.delete(data2);
                    break;
                case 6:
                    list.printList();
                    break;
                default:
                    System.out.println("Thankyou...");
                    break;
            }
        }
    }
}
