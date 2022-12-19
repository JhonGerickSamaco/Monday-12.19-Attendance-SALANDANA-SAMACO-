import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");              // Input a Name (String) of your desries
        String name = scanner.nextLine();                      // Declares name a DataType

        System.out.println(" ");
        System.out.println("Merry Christmas! " + name );        // Display the Marry Christmas plus the inputted name
       
        int i = 0;
             while(i<7){                                        // while loop to print an asterisk or just space
                 int j = 0;
                 int k = 0;
                 while(j<10-i){                                 // will print space if the counter is not met
                     System.out.print(" ");
                     j++;
                 }
                 while(k<(2*i)+1){                              // will print asterisk if the counter is  met
                     System.out.print("*");
                     k++;
                 }
                 ++i;
                 System.out.println("");
             } 
        
         int b = 1;                                             // repeat the while loop but in the third loop only
             while(b<2){
                 int j = 0;
                 int k = 0;
                 while(j<10-b){
                     System.out.print(" ");
                     j++;
                 }
                 while(k<(2*b)+1){
                     System.out.print("*");
                     k++;
                 }
                 ++b;
                 System.out.println("");
             } 
             int c = 1;
             while(c<2){
                 int j = 0;
                 int k = 0;
                 while(j<10-c){
                     System.out.print(" ");
                     j++;
                 }
                 while(k<(2*c)+1){
                     System.out.print("*");
                     k++;
                 }
                 ++c;
                 System.out.println("");
             } 

    }
}
