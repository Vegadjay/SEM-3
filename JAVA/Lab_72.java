// 72. Write a menu driven program to implement following operations on the doubly 
// linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.

public class Lab_72 {
    class Node {
        int info;
        Node lptr;
        Node rptr;
        public Node(int info) {
            this.info = info;
            this.lptr = lptr;
            this.rptr = rptr;
        }
    }
    
    Node head;
    Node tail;
    
    public Lab_72() { 
        this.head = null; 
        this.tail = null; 
    } 




    public void inserAtfirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.rptr = head;
            head.lptr = newNode;
            head = newNode;
        }   

    }
    
    


    public static void main(String[] args) {

    }
}