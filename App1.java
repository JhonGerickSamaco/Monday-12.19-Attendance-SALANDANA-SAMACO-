import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(" ");
        System.out.println("Merry Christmas! " + name );
        int i = 0;
             while(i<7){
                 int j = 0;
                 int k = 0;
                 while(j<10-i){
                     System.out.print(" ");
                     j++;
                 }
                 while(k<(2*i)+1){
                     System.out.print("*");
                     k++;
                 }
                 ++i;
                 System.out.println("");
             } 
        
         int b = 1;
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
