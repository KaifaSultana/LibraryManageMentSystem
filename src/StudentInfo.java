
// Java Program to Illustrate Student Class
// to take Input from the student and related Information

// Importing required classes
import java.util.Scanner;

// Class
public class StudentInfo extends User{

	// Class member variables
	String studentName;
	String Password;
	String mobileNumber;
	String emailId;

	Book borrowedBooks[] = new Book[3];
	public int booksCount = 0;

	// Creating object of Scanner class to
	// take input from user
	Scanner input = new Scanner(System.in);
	public StudentInfo(){
		User1();
	}
	// Constructor
	// public StudentInfo(String Name,String mobileNumber,String emailId,String Password)
	// {
	// 	studentName = Name;
	// }
}
