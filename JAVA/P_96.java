public class P_96 {
    public static void mergeSort(int l, int h, int[] a) {
        if(l < h) {
            int mid = (l + h) / 2;
            mergeSort(l, mid, a);
            mergeSort(mid + 1, h, a);
            merge(l, mid, h, a);
        }
    }
    
    public static void merge(int low, int mid, int high, int[] arr) {
        int[] b = new int[high - low + 1];
        int h = low;
        int i = 0;
        int j = mid + 1;
        
        while(h <= mid && j <= high) {
            if(arr[h] < arr[j]) {
                b[i++] = arr[h++];
            } else {
                b[i++] = arr[j++];
            }
        }
        
        while(h <= mid) {
            b[i++] = arr[h++];
        }
        
        while(j <= high) {
            b[i++] = arr[j++];
        }
        
        for(int a = 0; a < b.length; a++) {
            arr[low + a] = b[a];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {30, 20, 40, 10, 60, 70, 20};
        mergeSort(0, arr.length - 1, arr);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}