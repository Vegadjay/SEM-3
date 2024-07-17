// Design anagram game using array. 
//  Allow a user to enter N words and store it in an array. 
//  Generate a random number between 0 to N-1. 
//  Based on the random number generated display the word stored at that 
// index of an array and allow user to enter its anagram.
//  Check whether the word entered by the user is an anagram of displayed 
// number or not and display an appropriate message.
//  Given a word A and word B. B is said to be an anagram of A if and only if 
// the characters present in B is same as characters present in A, 
// irrespective of their sequence. For ex: “LISTEN” == “SILENT”

import java.util.Scanner;
public class P_32 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Name Do You Want to Add: ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        
        // Scanning Name From the user
        for(int i = 0; i<arr.length;i++) {
            System.out.print("Enter "+""+i+""+"th Name: ");
            arr[i] = sc.nextLine();
        }

        int random = (int)(Math.floor(Math.random()*((size-1))*100));
        String word1 = arr[random];
        System.out.println("This is the value of the random index: "+arr[random]);

        // Entering Value From User;

        System.out.print("Enter Word that You find in the array: ");
        String word = sc.nextLine();

        
        if(word1.length() == word.length()) {
            for(int i = 0;i<arr.length;i++) {

            }
        }
         
        else {
            System.out.print("Word is not anagram: ");
        }     

        sc.close();
    }   
}
