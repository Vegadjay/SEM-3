// 33. Write a program to swap two numbers using user-defines method. 
class Swap {
    public void swapNum(int a, int b) {
        System.out.print("Before Swaping: "+a+","+b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println('\n');
        System.out.println("After Swaping: "+a+","+b);
    }
}
public class P_33 {
    public static void main(String[] args) {
        Swap s1 = new Swap();
        s1.swapNum(2, 3);
    }
}