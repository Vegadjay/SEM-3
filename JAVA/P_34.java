import java.util.Scanner;
class Employee_Details {
    int Employee_ID;
    String name;
    String Designation;
    float salary;

    public void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id: ");
        Employee_ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Designation: ");
        Designation = sc.nextLine();
        System.out.print("Enter salary: "); 
        salary =sc.nextFloat();
    }

    public void printDetails() {
        System.out.println("This is the name of the Employee: "+this.name+"\n"+"This is the id of the Employee: "+Employee_ID+"\n"+"This is the designation of the Employee :" + Designation +"\n"+ "This is the salary of the salary: "+salary);
    }

}
public class P_34 {
    public static void main(String[] args) {
        Employee_Details ed = new Employee_Details();
        ed.readDetails();
        ed.printDetails();
    }
}