import java.util.Scanner;
public class P_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {20,30,40,50};
        System.out.print("Enter Number :: ");
        int num = sc.nextInt();
        for(int i = 0;i<arr.length;i++) {
            if(num == arr[i]) {
                System.out.println("Number find at index no. "+i);
                return;
            }
        }
    }
}