import java.util.Scanner;

public class EmailIDValidation extends EmailID{
	// main method
	public static void main(String[] args) {
		EmailID id = new EmailID(); // object 'id' created.
		Scanner sc = new Scanner(System.in); // object 'sc' created.
		
		// using while loop just for taking success case 
		// and failure case output in a frame.
		int i=0; 
		while(i < 2) {
			System.out.println("Enter Email ID: ");
			String emailID = sc.next(); // taking input from user.
			System.out.println(id.isValid(emailID)); // calling isValid() method.
			i++;
		}
	}
}
