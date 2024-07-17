import java.util.Scanner;

public class ListLink {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node first = null;

    // public void insertAtfirst() {
    // System.out.print("Enter Number that you enter in list:");
    // Scanner sc = new Scanner(System.in);
    // int data = sc.nextInt();
    // Node newNode = new Node(data);
    // if (first == null) {
    // first = newNode;
    // return;
    // }
    // Node temp = first;
    // first = newNode;
    // first.link = temp;
    // }

    // Insert At First Code From Screach

    // public void insertAtfirst(int data) {

    // Node newNode = new Node(data);

    // if (first == null) {
    // first = newNode;
    // return;
    // }

    // Node temp = first;
    // first = newNode;
    // first.link = temp;

    // }

    // InsertAtLast from scertch

    public void insertAtlast(int num) {
        Node newNode = new Node(num);
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

    // Algo For Insert at first

    public void insertAtfirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;
        first = newNode;
        first.link = temp;

    }

    // // Insert At last index
    // public void insertAtlast() {
    // System.out.print("Enter Number that you enter in list:");
    // Scanner sc = new Scanner(System.in);
    // int a1 = sc.nextInt();
    // Node newNode = new Node(a1);
    // if (first == null) {
    // first = newNode;
    // return;
    // }

    // Node last = first;
    // while (last.link != null) {
    // last = last.link;
    // }
    // last.link = newNode;
    // }

    // PrintList    
    public void PrintList() {
        if (first == null) {
            System.out.println("List is empty: ");
            return;
        }
        Node curNode = first;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.link;
        }
        System.out.println("NULL");
    }

    // Delete First Node
    public void deleteAtFirst() {
        if (first == null) {
            System.out.println("Link is empty...");
            return;
        }
        first = first.link;
    }

    // deletLast

    public void deleteAtLast() {
        Node secondLast = first;
        Node lastNode = first.link;

        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        if (first.link == null) {
            first = null;
            return;
        }

        while (lastNode.link != null) {
            lastNode = lastNode.link;
            secondLast = secondLast.link;
        }

        secondLast.link = null;
    }

    // Delete Node using Number

    public void deletAtNum(int num) {
        // check list is not underflow

        if (first == null) {
            System.out.println("List is underflow");
            return;
        }

        // Take two pointers and get address for tracking

        Node save = first, pred = null;

        if (save.data == num) {
            save = save.link;
            return;
        }

        while (save.data != num && save.link != null) {
            pred = save;
            save = save.link;
        }

        // Now check for x != null

        if (save == null) {
            System.out.println("Node not found");
        }

        pred.link = save.link;

    }


    // ! Pending

    // public void insertAtBetween(int data) {
    //     Node newNode = new Node(data);

        
    // }

    

    // Copy linklist

    public void copyList() {
        if(first == null) {
            System.out.println("Stack is null");
            
        }    
    }
    



    public static void main(String[] args) {
        ListLink l1 = new ListLink();

        l1.insertAtfirst(30);
        l1.deletAtNum(30);

        l1.PrintList();
    }
}