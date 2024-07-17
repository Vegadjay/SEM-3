//  Write a program to delete duplicate numbers from an array.
import java.util.Scanner;

public class P_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements: ");
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];
        
        System.out.println("Here Is Your New Array (without duplicates): ");
        for(int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}