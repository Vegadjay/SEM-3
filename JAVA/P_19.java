// Pascal Triangle
public class P_19 {
    public static void main(String[] args) {
        int idx = 12;
        for (int i = 0; i < idx; i++) {
            // Print spaces for left alignment
            for (int k = idx - 1; k >= i; k--) {
                System.out.print(" ");
            }

            // Calculate and print the values of the current row
            int val = 1;
            System.out.print(val);
            for (int j = 1; j <= i; j++) {
                val = val * (i - j + 1) / j;
                System.out.print(" " + val);
            }

            System.out.print("\n");
        }
    }
}