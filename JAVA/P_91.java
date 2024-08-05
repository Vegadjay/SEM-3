import java.util.Scanner;
public class P_91 {
    
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int left = 0;   
        int right = arr.length - 1;
        while(left < right) {
            int middle = (left + right) + 1 / 2;
            if(arr[middle] == num) {
                System.out.println(middle);
                break;
            }
            else if(num<arr[middle]) {
                right = middle - 1;
            }
            else if(num>arr[middle]){
                left = middle + 1;
            }
            return;
        }
    }       
}
