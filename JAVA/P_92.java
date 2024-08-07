// find the bug

public class P_92 {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        if(n == 0) {
            n = 1;
        }
        else {
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                for(int j = i;j<arr.length;j++){
                    if(arr[j]<min) {
                        min = arr[j];
                        idx = j;
                        int temp = arr[i];
                        arr[idx] = temp;
                        arr[i] = min;
                    }
                }  
            }

        }
        for(int i = 0;i<n;i++) {
            System.out.println(arr[i] + ",");
        }
    }


    public static void main(String[] args) {
        int arr[] = {30,40,10,20,50};
       bubbleSort(arr);
    }
}