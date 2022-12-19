import java.util.ArrayList;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		ArrayList<String> stud = new ArrayList<String>();
		stud.add("Richard");
		stud.add("Ashton");
		stud.add("Hailey");
		stud.add("Yurina");
		stud.add("Judith");
		
		indexRemover(stud);                                     // Declares the indexRemover
	}
	
	public static void indexRemover (ArrayList<String> stud) { // This is the method for the removing of the declared index
		Scanner sc = new Scanner(System.in);
		while(stud.size() > 0) {
            System.out.print("\n"+"Enter an Index: ");          // Enters the desired Index to be deleted.
			int index = sc.nextInt();
			
			if (index >= stud.size()) {                         // This is where the declared index is validated
				System.out.println("Invalid Index");
				break;
			}
			
			System.out.println(stud.get(index) + " deleted."); 
			stud.remove(index);                                 // This is where the declared index value is going to be deleted.
			System.out.print("Updated Elements: ");
			
			for (String x : stud) {                              // Displays the Updated or the Elements that aren't removed yet.
				System.out.print(x + ", ");
			}
			
		}
		sc.close();
	}

}
