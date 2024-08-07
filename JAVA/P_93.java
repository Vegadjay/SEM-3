public class P_93 {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0;i<n;i++) {
            int j = i -1;
            int key = arr[i];

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
       // print list
       for (int i = 0; i < n; i++) {
           System.out.println(arr[i]+",");
       }
    }
    
    public static void main(String[] args) {
        int arr[] = {30,40,50,20,10};
        insertionSort(arr);
    }
}
