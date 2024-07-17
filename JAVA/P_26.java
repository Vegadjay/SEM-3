//  Write a program to merge two unsorted arrays.
import java.util.Scanner;
public class P_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Array size: ");
        int size = sc.nextInt();
        System.out.print("Enter Second Array Size: ");
        int size1 = sc.nextInt();


        // Decalre Array

        int arr[] = new int[size];
        int arr2[] = new int[size1];
        int arr3[] = new int[size + size1];
        // Get Input From User...

        System.out.println("Enter First Array Elements: ");
        for(int i = 0;i<arr.length;i++) {
            System.out.print(i+" ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter Second Array Elements: ");
        for(int i = 0;i<arr2.length;i++) {
            System.out.print(i+" ");
            arr2[i] = sc.nextInt();
        }
        
        for(int i = 0;i<arr.length;i++) {
            arr3[i] = arr[i];
        }
        
        for(int i = 0;i<arr2.length;i++) {
            arr3[size] = arr2[i];
            size++;
        }
        System.out.println("Here Is The Merge Array: ");
        for(int i = 0;i<arr3.length;i++) {
            System.out.println(arr3[i] + '\n');
        }
        
        
        sc.close();
    }
}
