public class ShellSort {

    public static void shell_sort(int arr[],int n) {
        for(int gap = n / 2; gap >= 1; gap=gap/2) {
            for(int j = gap; j<n;j++) {
                for(int i = j-gap;i>=0; i=i-gap) {
                    if(arr[i+gap] > arr[i]) {
                        break;
                    }
                    else {
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = { 22,23,34,54,6543,21,1,22,1,1,1,1,345,6,3,454 };
        int n = arr.length;
        shell_sort(arr, n);
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
