// Get Input From User and add element in that index
import java.util.*;
public class Lab_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,15,5,17};
        
        System.out.println("enter index: ");
        int idx = sc.nextInt();
        System.out.println("Enter new no.: ");
        int n = sc.nextInt();
        int arr2[] = new int[arr.length+1] ;
        boolean isFalse = false;
        for(int i = 0;i < arr2.length;i++){
            if(idx == i){
                arr2[i] = n;
                isFalse = true;
            }
            else if(isFalse){
                arr2[i] = arr[i-1];
            }
            else{
                arr2[i] = arr[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        sc.close();
    }
    
}
