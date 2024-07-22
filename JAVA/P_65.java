// Write a program to sort elements of a linked list.
// TODO: Find the bug this code is not print list.
public class P_65 {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

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

    public void sortLink() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        boolean isTrue = true;
        while (isTrue) {
            Node temp1 = first;
            Node temp2 = first.link;
            Node save = null;
            while (temp2 != null) {
                if (temp1.info > temp2.info) {
                    if (save != null) {
                        Node temp = temp2.link;
                        save.link = temp2;
                        temp2.link = temp1;
                        temp1.link = temp;
                    } else {
                        Node temp = temp2.link;
                        first = temp2;
                        temp2.link = temp1;
                        temp1.link = temp;
                    }
                    save = temp2;
                    temp2 = temp1.link;
                } else {
                    save = temp1;
                    temp1 = temp2;
                    temp2 = temp2.link;
                }
            }
        }
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
        P_65 list = new P_65();
        list.insertAtfirst(30);
        list.insertAtfirst(20);
        list.insertAtfirst(10);
        list.insertAtfirst(50);
        list.sortLink();
        list.print();
    }
}
