// Read n numbers in an array then read two different numbers, replace 1st
// number with 2nd number in an array and print its index and final array
import java.util.Scanner;
public class P_18 {
    public static void main(String[] args) {
        //  Making Scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size ::: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter First Number:::");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number::: ");
        int num2 = sc.nextInt();
        for(int i = 0;i<size;i++) {
            System.out.print("Enter "+ i +" th Element::: ");
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        int idx1 = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == num1) {
                arr[i] = num2;
                idx = i;
            }
            else if(arr[i] == num2) {
                if(arr[i] == num2) {
                    arr[i] = num1;
                    idx1 = i;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("Index of first Element: "+idx + " " +"Index Of Second Element: "+ idx1);
        sc.close();
    }
}