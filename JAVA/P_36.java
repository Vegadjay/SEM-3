class Converter {
    public void changefartocel(double f) {
        double c = ((9*f/5) + 32);
        System.out.println("This is the celcius: "+c);
    }
    public void changeceltofar(double c) {
        double f = (c-32)*5/9;
        System.out.println("This is the faranhit: "+f);
    }
}
public class P_36 {
    public static void main(String[] args) {
        Converter c = new Converter();
        c.changeceltofar(30);
        c.changefartocel(30);
    }
}