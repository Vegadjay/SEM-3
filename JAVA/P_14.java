// . Write a program to calculate sum of numbers from m to n.
import java.util.Scanner;
public class Lab_14 {
    public static void main(String[] args) {
        // Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:: ");
        int m = sc.nextInt();
        System.out.print("Enter Second Number:: ");
        int n = sc.nextInt();
        // Intereate Loop For sum
        int sum = 0;
        if(n<m) {
            System.out.println("Enter Valid Numbers:: ");
        }
        else {
            for(int i = m; i <= n; i++) {
                sum += i;
            }
            System.out.println("Here is the sum:: "+sum);
        }
    }
}
