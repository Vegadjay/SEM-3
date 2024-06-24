// Take N names from user and set in an alphabetical order.
import java.util.Arrays;
import java.util.Scanner;
public class P_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of your names: ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter Your All Names:  ");
        
        for(int i = 0;i<size;i++) {
            System.out.print(i+":");
            arr[i] = sc.next();
        }
        
        Arrays.sort(arr);
        System.out.print("Here Is Your Sorted Named list: ");
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+'\n');
        }
        
        sc.close();
    }
}