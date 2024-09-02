public class HeapSort {
    public static void Heap_Sort(int arr[]) {
        int n = arr.length;
        max_heap(arr);
        for(int i = n - 1; i>=0; i--) {
            swap(arr, i, 0);
            Heapify(arr, i, 0);
        }
    }

    public static void Heapify(int arr[], int n, int i) {
        int max = i;
        int left_max = (2 * i) + 1;
        int right_max = (2 * i) + 2;

        if(left_max < n &&  arr[left_max] > arr[max]) {
            max = left_max;
        }

        if(right_max < n && arr[right_max] > arr[max]) {
            max = right_max;
        }

        if(!(i == max)) {
            swap(arr,i,max);
            Heapify(arr, n, max);
        }
    }

    public static void swap(int arr[],int i,int b) {
        int temp = arr[i];
        arr[i] = arr[b];
        arr[b] = temp;
    }

    public static void max_heap(int arr[]) {
        int n = arr.length;
        for(int i = (n / 2) - 1; i >= 0; i--) {
            Heapify(arr,n,i);
        }
    }

    public static void print_array(int arr[]) {
        for(int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + ",");
        }
    }


    public static void main(String[] args) {
        int arr[] = {30,40,50,20,10};
        Heap_Sort(arr);
        print_array(arr);
    }
}
