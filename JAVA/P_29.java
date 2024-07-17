import java.util.*;

public class P_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers : ");
        int number = sc.nextInt();

        for (int j = 0; j < number; j++) {
            System.out.println("Enter size of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element : ");
                arr[i] = sc.nextInt();
            }

            int ar2[] = new int[n];
            int num = n;
            Arrays.sort(arr);
            for (int i = 0; i < n; i += 2) {
                ar2[i] = arr[(i + n) / 2];
                if(i+1 != n){
                    ar2[i + 1] = arr[i];
                }
                if ((i + n) / 2 < n) {
                    num--;
                }
            }

            System.err.println(num);

            for (int i = 0; i < n; i++) {
                System.out.print(ar2[i] + " ");
            }
        }
        sc.close();
    }
}