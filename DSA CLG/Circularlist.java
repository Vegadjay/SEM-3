public class Circularlist {
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
        }
    }

    public Node first = null;
    public Node last = null;

    public void insertAtfirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            newNode.link = newNode;
            first = last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }
    }

    public void insertAtlast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            newNode.link = newNode;
            first = last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            last = newNode;
        }
    }

    public void insertAtorder(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            newNode.link = newNode;
            first = last = newNode;
            return;
        }

        if (newNode.data <= first.data) { // 10 <= 20
            newNode.link = first;
            last.link = newNode;
            first = newNode;
            return;
        }

        Node pred = first;

        while (pred != last && newNode.data >= pred.link.data) {
            pred = pred.link;
        }
        newNode.link = pred.link;
        pred.link = newNode;

        if (pred == last) {
            last = newNode;
        }
        return;
    }

    public void delete(int data) {
        if (first == null) {
            System.out.print("LinkList is empty..");
            return;
        }
        Node save = first;
        Node pred = first;

        while (save.data != data && save != last) {
            pred = pred.link;
            save = save.link;
        }

        if (save.data != data) {
            System.out.println("Node is not found");
            return;
        }

        if (data == first.data) {
            first = first.link;
            last.link = first;
        }

        else {
            if (data == last.data) {
                last = pred;
            }
        }

    }

    public void display() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = first;
        do {
            System.out.print(current.data + " ");
            current = current.link;
        } while (current != first);
        System.out.println();
    }

    public static void main(String[] args) {
        Circularlist c1 = new Circularlist();
        c1.insertAtfirst(20);
        c1.insertAtfirst(10);
        c1.insertAtfirst(30);
        System.out.println("After inserting at first:");

        c1.insertAtlast(40);
        c1.insertAtlast(50);
        c1.insertAtlast(60);
        System.out.println("After inserting at last:");

        c1.insertAtorder(70);
        c1.insertAtorder(80);
        c1.insertAtorder(20);

        c1.display();
    }
}