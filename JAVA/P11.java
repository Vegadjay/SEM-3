import java.util.Scanner;

public class P11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      int temp = 0;
      for (int j = 1; j <= i; j++) {
        temp += j;
      }
      sum += temp;
    }
    System.out.println(sum);
  }
}