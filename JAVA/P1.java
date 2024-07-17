import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double radius = input.nextDouble();
    System.out.println("The area of the circle is " + radius * radius * Math.PI);
    input.close();
  }
}