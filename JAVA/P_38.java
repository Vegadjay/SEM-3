import java.util.Scanner;

class S {
    int top;
    int[] s;
    int size;

    S() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the stack: ");
        this.size = sc.nextInt();
        this.top = -1;
        this.s = new int[this.size];
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack is overflow");
        } else {
            top++;
            s[top] = x;
        }
    }

    public int pop() {
        int ele = 0;
        if (top < 0) {
            System.out.println("Stack is underflow");
        } else {
            ele = s[top];
            top--;
        }
        return ele;
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }

    public int peep(int i) {
        int ele = 0;
        if (top - i + 1 < 0) {
            System.out.println("Stack is underflow");
        } else {
            ele = s[top - i + 1];
        }
        return ele;
    }

    public void change(int index, int element) {
        if (top - index + 1 < 0) {
            System.out.println("Invalid index");
        } else {
            s[top - index + 1] = element;
        }
    }
}

public class P_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S s = new S();
        
        while (true) {
            System.out.print(
                "Enter 1 for push, 2 for pop, 3 for display stack, 4 for peep, 5 for change element, and 6 to finish the program: ");
            int userNum = sc.nextInt();
            
                if (userNum == 6) {
                    break;
                }

            switch (userNum) {
                case 1:
                    System.out.print("Enter number to push in stack: ");
                    int num = sc.nextInt();
                    s.push(num);
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped != 0) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.print("Enter index of element you want to peep: ");
                    int num1 = sc.nextInt();
                    int peeped = s.peep(num1);
                    if (peeped != 0) {
                        System.out.println("Peeped element: " + peeped);
                    }
                    break;
                case 5:
                    System.out.print("Enter Index and number that you want to change: ");
                    int idx = sc.nextInt();
                    int num2 = sc.nextInt();
                    s.change(idx, num2);
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