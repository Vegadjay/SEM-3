import java.util.Scanner;

public class P10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of days");
    int days = sc.nextInt();
    int year = days / 365;
    int week = (days % 365) / 7;
    int day = (days % 365) % 7;
    System.out.println(days + " days = " + year + " years, " + week + " weeks, " + day + " days");
    sc.close();
}
}