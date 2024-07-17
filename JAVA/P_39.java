import java.util.Stack;
import java.util.Scanner;

public class P_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<Character>();

        int top = 1;
        stack.push('c');
        int i = 0;
        char char1 = str.charAt(i);

        while (str.charAt(i) != 'c') {
            if (char1 == ' ') {
                System.out.print("Invalid String : ");
                return;
            } else {
                top++;
                stack.push(char1);
            }
            i++;
            char1 = str.charAt(i);
        }

        i++;
        while (i < str.length()) {
            char1 = str.charAt(i);

            char x = stack.pop();

            if (x == char1) {
                top--;
            } else {
                System.out.print("Invalid String : ");
                return;
            }

            i++;
        }

        if (top == 1) {
            System.out.print("Valid String ");
        } else {
            System.out.print("Invalid String ");
        }
    }
}