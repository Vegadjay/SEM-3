
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
        System.out.print("Enter Size of the Q: ");
        this.size = sc.nextInt();
        this.top = -1;
        this.s = new int[this.size];
    }

    int r = -1;
    int f = -1;

    public void Insert(int x) {
        if (r + 1 >= this.size) {
            System.out.println("Q is overflow");
        } else if (f == -1) {
            f++;
            r++;
            s[r] = x;
        } else if (r + 1 >= size && f != 0) {
            r = -1;
        } else {
            r++;
            s[r] = x;
        }
    }

    public void Delete() {
        if (f == -1) {
            System.out.println("Q is underflow");
        } else if (f + 1 >= size) {
            f = 0;
        } else {
            s[f] = 0;
            f++;
        }
    }

    public void display() {

        System.out.print("[");
        for (int i = f; i <= r; i++) {
            if (f > r && f + 1 >= size) {
                i = 0;
            }
            System.out.print(s[i] + "|");
        }
        System.out.println("]");
    }

}

public class P_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue s = new Queue();

        while (true) {
            System.out.print(
                    "Enter 1 for NQ, 2 for DQ, 3 for display Q, 4 for exit: ");
            int userNum = sc.nextInt();

            if (userNum == 4) {
                break;
            }

            switch (userNum) {
                case 1:
                    System.out.print("Enter number to push in stack: ");
                    int num = sc.nextInt();
                    s.Insert(num);
                    break;
                case 2:
                    s.Delete();
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