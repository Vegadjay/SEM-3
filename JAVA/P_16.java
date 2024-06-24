// . Write a program to find position of the smallest number & the largest number
// from given n numbers.
import java.util.Scanner;
public class Lab_16 {
    public static void main(String[] args) {
        // Making Scanner Object

        Scanner sc = new Scanner(System.in);

        // Get Elements By the user

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++) {
            System.out.print("Enter " + i + "th Element:: ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int maxNum = 0;
        int minNum = 0;
        for(int i = 0;i<arr.length;i++) 
        {
            if(arr[i]<min) {
                min = arr[i];
                minNum = i;
            }
            if(arr[i] > max) {
                max = arr[i];
                maxNum = i;
            }
        }
        System.out.println("here is the max of the array: "+ maxNum + "here is the min of the array: "+minNum);
    }
}
