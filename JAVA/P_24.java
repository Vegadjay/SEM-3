// Write a program to delete a number from an array that is already sorted in an 
// ascending order.
import java.util.Scanner;
public class P_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter the number that you want to delete: ");
        int num = sc.nextInt();
        int arr[] = new int[size];
        int arr2[] = new int[size-1];
        System.out.println("Enter Elements: ");

        for(int i = 0;i<size;i++) {
            System.out.print(i+" ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0,j=0;i<arr.length;i++) {
            if(num == arr[i]) {
                arr2[j] = arr[i+1];
                i++;
                j++;
            }
            else {
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.print("Here Is Your Updated Array: ");
        for(int i = 0;i<arr2.length;i++) {
            System.out.println(arr2[i]);
        }
        sc.close();
    }
}
