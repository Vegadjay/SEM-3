// . Read two matrices, first 3x2 and second 2x3, perform multiplication operation 
// and store result in third matrix and print it.
import java.util.Scanner;

public class P_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][2];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[3][3];

        // Scanning First Matirx
        System.out.println("Enter first matrix element : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // Scanning Second Matrix
        System.out.println("Enter Second matrix element : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }   

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + ",");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}