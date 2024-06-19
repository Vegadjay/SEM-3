import java.util.Scanner;
public class Lab_13 {
    public static void main(String[] args) {
        // Making Scanner Class Object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + "th element:: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Here Is your array:: ");
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+",");
        }
        sc.close();
    }
}