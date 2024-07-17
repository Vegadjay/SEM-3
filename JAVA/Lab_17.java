// Find Duplicate ele in array
import java.util.Scanner;
public class Lab_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean flag = false;
        for(int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j!=i;j++){
                if(arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
        }
        if(flag == true) {
            System.out.println("Array Contains Dup ele");
        }
        else {
            System.out.println("Array is not Contains Dup ele");
        }
        sc.close();
    }
}
