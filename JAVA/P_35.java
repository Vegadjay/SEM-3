class Student_details {
    long enroll;
    String name;
    double cpi;
    int sem;
    public void readInfo(long enroll, String name,double cpi, int sem) {
        this.enroll = enroll;
        this.name = name;
        this.cpi = cpi;
        this.sem = sem;
    }
    public void printInfo() {
        System.out.println("Enroll is: "+enroll+'\n'+"Name is: "+name+'\n'+"CPI is: "+cpi+'\n'+"Sem is: "+sem);
    }
}
public class P_35 {
    public static void main(String[] args) {
        Student_details arr[];
        arr = new Student_details[2];
        arr[0] = new Student_details();
        arr[1] = new Student_details();

        arr[0].readInfo(230101019, "Manoj", 3.4, 1);
        arr[1].readInfo(230101020, "Manoj sir", 5.4, 2);


        arr[0].printInfo();
        arr[1].printInfo();
    }
}