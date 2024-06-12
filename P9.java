import java.util.Scanner;

public class P9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter seconds");
    int seconds = sc.nextInt();
    int hours = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    int sec = (seconds % 3600) % 60;
    System.out.println(hours + ":" + minutes + ":" + sec);
    sc.close();
  }
}