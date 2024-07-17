import java.util.Scanner;

public class P_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n+1];
        
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter number : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number that you add: ");
        int num = sc.nextInt();
        
        int j=0;
        while(j < n && num >= arr[j])
        {
            arr2[j] = arr[j];
            j++;
        }
        
        arr2[j] = num;
        j++;
        
        while(j <= n)
        {
            arr2[j] = arr[j-1];
            j++;
        }
        
        for(int i=0; i<=n; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}