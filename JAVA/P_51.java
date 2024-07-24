
// 51. Write a menu driven program to implement following operations on a circular 
// queue using an Array
//  Insert
//  Delete
//  Display all elements of the queue
import java.util.Scanner;

class Queue {
    int top;
    int[] s;
    int size;

    Queue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Queue: ");
        this.size = sc.nextInt();
        this.top = -1;
        this.s = new int[this.size];
    }
}

public class P_51 {
    public static void main(String[] args) {

    }
}
