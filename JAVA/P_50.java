
// 50. Write a menu driven program to implement following operations on the Queue 
// using an Array
//  ENQUEUE
//  DEQUEUE
//  DISPLAY
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

    int r = -1;
    int f = -1;

    public void ENQUEUE(int x) {
        if (r + 1 >= this.size) {
            System.out.println("Queue is overflow");
        } else if (f == -1) {
            f++;
            r++;
            s[r] = x;
        } else {
            r++;
            s[r] = x;
        }
    }

    public void DEQUEUE() {
        if (f == -1) {
            System.out.println("Queue is underflow");
        } else {
            s[f] = 0;
            f++;
        }
    }

    public void display() {
        System.out.print("[");
        for (int i = f; i <= r; i++) {
            System.out.print(s[i] + "|");
        }
        System.out.println("]");
    }
}

public class P_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue s = new Queue();

        while (true) {
            System.out.print(
                    "Enter 1 for ENQUEUE, 2 for DEQUEUE, 3 for display QUEUE, 4 for exit: ");
            int userNum = sc.nextInt();

            if (userNum == 4) {
                break;
            }

            switch (userNum) {
                case 1:
                    System.out.print("Enter number to push in stack: ");
                    int num = sc.nextInt();
                    s.ENQUEUE(num);
                    break;
                case 2:
                    s.DEQUEUE();
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        System.out.println("Program ended.");
        sc.close();
    }
}