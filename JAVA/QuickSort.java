public class QuickSort {
    public static void Quick_Sort(int arr[],int LB, int UB) {
        boolean flag = true;
        if(LB < UB) {
            int i = LB;
            int j = UB + 1;
            int key = arr[LB];
            while(flag) {
                i = i + 1;
                while (i <= UB && arr[i] < key) {
                    i = i + 1;
                }
                j = j - 1;
                while (j >= LB && arr[j] > key) {
                    j = j - 1;
                }
                if(i<j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else {
                    flag = false;
                }
            }
            int temp = arr[LB];
            arr[LB] = arr[j];
            arr[j] = temp;
            Quick_Sort(arr,LB,j-1);
            Quick_Sort(arr, j+1, UB);
        }
    }

    public static void print(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 22,23,34,54,6543,21,1,22,1,1,1,1,345,6,3,454 };
        int n = arr.length;
        Quick_Sort(arr, 0, n-1);
        print(arr);
    }
}

