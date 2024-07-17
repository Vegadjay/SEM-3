// Avarage of first n numbers
import java.util.Scanner;
public class Lab_15 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        System.out.println("Enter Your Number:: ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
            for(int i = 1; i <= n; i++) {
                sum += i;
            }
            avg = sum / n;
            System.out.println("Here is the avg:: "+avg);
            sc.close();
        }    
}
