public class P_94 {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0;i<n-1;i++) {
            int min_idx = i;
            for(int j = i+1;j<n;j++) {
                if(arr[j]<arr[min_idx] ) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        // print list
        for(int i = 0;i<n;i++) {
            System.out.println(arr[i] +",");
        }
    }

    public static void main(String[] args) {
            int arr[] = {30,40,50,10,20};
            selectionSort(arr);
        }
}
