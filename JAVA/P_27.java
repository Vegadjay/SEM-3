//  WAP to replace lowercase characters by uppercase & vice-versa in a user specified 
// string.
import java.util.Scanner;
public class P_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get input from user
        System.out.print("Enter Your Word:  ");
        String ipt = sc.nextLine();
        char chr[] = new char[ipt.length()];
        char ch = 'a';

        for(int i = 0;i<ipt.length();i++) {
            ch = ipt.charAt(i);
            char convertlower = Character.toLowerCase(ch);
            if(ch == convertlower) {
                chr[i] = Character.toUpperCase(ch);
            }
            else {
                chr[i] = Character.toLowerCase(ch);
            }
        }

        for(int i = 0;i<chr.length;i++) {
            System.out.print(chr[i]+",");
        }
        sc.close();
    }    
}
