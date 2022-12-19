import java.util.Scanner;

public class App3 {

    static boolean isPalindrome(String str) {       // This 1st method will be true if the input is Palindrome

        int a = 0, b = str.length() - 1;            // Stating sa beginning and the end of the string

        while (a < b) {                             // While loop for comparison determine if there will me a mismatch
            if (str.charAt(a) != str.charAt(b))      
                return false;

           
            a++;                                    
            b--;                                    
        }

       
        return true;                                // Will return if the input is Palindrome
    }

    public static void main(String[] args) {        // The main Method
         String str, rev = "";                      // will Input string data type
          Scanner sc = new Scanner(System.in);      // instantiated the scanner object

          System.out.println("Enter a word:");    // will request for an input word to be process
          str = sc.nextLine().toLowerCase();    

        if (isPalindrome(str))                         // If condition will be true boolean function until it will be meet
            System.out.print("True. It is a PALINDROME. ");     // Display Palindrome if it is true
        else
            System.out.print("False. Not a  PALINDROME. ");     // Display Palindrome if it is false
    }
}
