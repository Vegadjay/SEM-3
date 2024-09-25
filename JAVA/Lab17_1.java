import java.util.*;

public class Lab17_1 {
    static int[] hash = new int[20];

    public static void store(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = hashFn(arr[i]);
            if (index != -1) {
                hash[index] = arr[i];
            } else {
                System.out.println("Hash table is full, cannot insert " + arr[i]);
            }
        }
    }

    public static int hashFn(int n) {
        int index = (n % 18) + 2;
        int originalIndex = index;
        
        while (hash[index] != 0) {
            index = (index + 1) % 20;
            if (index == originalIndex) {
                return -1;
            }
        }
        
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[15];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(900000) + 100000;
        }

        store(arr);

        System.out.println("Hash table contents:");
        System.out.println(Arrays.toString(hash));

    }
}