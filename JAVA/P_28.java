// Suppose you are senior developer for an Relational Database Management System 
// named "Array Database" where everything is implemented using only array, today 
// your task is to implement aggregate function like sum, min, max, avg. For simplicity, 
// assume that your database can only store integers.
import java.util.Scanner;
class Database {
    public int printSum(int[] arr) {
        int sum =0;
        for(int i = 0;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }
    public int printMin(int arr[]) {
        int min = arr[0];
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int printMax(int[] arr) {
        int max = arr[0];
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public double printAvg(int[] arr) {
        int sum =0;
        for(int i = 0;i<arr.length;i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
    
}
public class P_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        Database d1 = new Database();

        System.out.println(d1.printSum(arr));
        System.out.println(d1.printMin(arr));
        System.out.println(d1.printAvg(arr));
        System.out.println(d1.printMax(arr));
        sc.close();
    }
}
