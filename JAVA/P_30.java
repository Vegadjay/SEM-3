// . Read two 2x2 matrices and perform addition of matrices into third matrix and 
// print it
import java.util.Scanner;
public class P_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][]  = new int[2][2];
        int arr2[][] = new int[2][2];
        int arr3[][] = new int[2][2];


        System.out.println("Enter First Array's Element: ");
        
        for(int i = 0;i<2;i++) {
            for(int j =0;j<2;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Array's Element:  ");

        for(int i = 0;i<2;i++) {
            for(int j = 0;j<2;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // For Printing Sum


        for(int i = 0;i<2;i++) {
            for(int j = 0;j<2;j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i = 0;i<2;i++) {
            for(int j = 0;j<2;j++) {
                System.out.println(arr3[i][j]+" ");
            }
        }

        sc.close();
    }
}
