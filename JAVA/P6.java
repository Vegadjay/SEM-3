// write program to find power of a number using loop

import java.util.Scanner;

public class P6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    System.out.print("Enter a power: ");
    int power = input.nextInt();
    int result = 1;
    for (int i = 1; i <= power; i++) {
      result = result * num;
    }
    System.out.println(result);
    input.close();
  }
}