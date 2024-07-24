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
    
    public void insertAtLast(int data) {
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
    
    public void insertAtFirst(int data) {
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
        if (first == null || first.link == null) {
            return; // List is empty or has only one element, no need to sort
        }

        boolean swapped;
        do {
            swapped = false;
            Node prev = null;
            Node current = first;
            Node next = first.link;

            while (next != null) {
                if (current.info > next.info) {
                    swapped = true;

                    if (prev == null) {
                        // Swapping at the beginning of the list
                        first = next;
                    } else {
                        prev.link = next;
                    }

                    current.link = next.link;
                    next.link = current;

                    prev = next;
                    next = current.link;
                } else {
                    prev = current;
                    current = next;
                    next = next.link;
                }
            }
        } while (swapped);
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
        list.insertAtFirst(30);
        list.insertAtFirst(20);
        list.insertAtFirst(10);
        list.insertAtFirst(50);
        System.out.println("Original list:");
        list.print();
        list.sortLink();
        System.out.println("Sorted list:");
        list.print();
    }
}