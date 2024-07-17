import java.util.Scanner;

public class P3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a char: ");
    char ch = input.next().charAt(0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      System.out.println(ch + " is vovel");
    } else {
      System.out.println(ch + " is consoant");
    }
    input.close();
  }
}