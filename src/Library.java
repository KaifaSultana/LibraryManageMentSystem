
// Java Program to Illustrate Application CLass
// To Create The Menu For the Program

// Importing required classes
import java.util.Scanner;

// Class
public class Library {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of Scanner class
		// to take input from user
		Scanner input = new Scanner(System.in);

		// Displaying menu
		System.out.println(
			"********************Welcome to the Digital Library!********************");
		System.out.println(
			"				 Select From The Following Options:			 ");
		System.out.println(
			"**********************************************************************");

		// Creating object of book class
		BookOperations ob = new BookOperations();
		// Creating object of students class
		User obUser = new User();
		// Creating object of students class
		StudentOperation obStudent = new StudentOperation();
        // Creating object of Libraryoperation class
        LibrarianOperation obLibrary = new LibrarianOperation();

		int choice;
		int choice1;
		int searchChoice;
		
		do{
			ob.dispMenu1();
			choice1 = input.nextInt();

			// Switch case
			switch (choice1) {

				// Case
			case 1:
			// if(obStudent.isStudent()>0)
			int studentIndex = obStudent.isStudent();

if (studentIndex > -1)
			do {
				ob.dispMenu();
				choice = input.nextInt();
	
				// Switch case
				switch (choice) {
	
					// Case
				case 1:
					Book b = new Book();
					ob.addBook(b);
					break;
	
					// Case
				case 2:
					ob.upgradeBookQty();
					break;
	
				// Case
				case 3:
	
					System.out.println(
						" press 1 to Search with Book Serial No.");
					System.out.println(
						" Press 2 to Search with Book's Author Name.");
					searchChoice = input.nextInt();
	
					// Nested switch
					switch (searchChoice) {
	
						// Case
					case 1:
						ob.searchBySno();
						break;
	
						// Case
					case 2:
						ob.searchByAuthorName();
					}
					break;
	
					// Case
				case 4:
					ob.showAllBooks();
					break;
	
					// Case
				case 5:
					StudentInfo s = new StudentInfo();
					obStudent.addStudent(s);
					break;
	
					// Case
				// case 6:
				// 	obStudent.showAllStudents();
				// 	break;
	
					// Case
				case 7:
					obStudent.checkOutBook(ob);
					break;
	
					// Case
				case 8:
					obStudent.checkInBook(ob);
					break;
	
					// Default case that will execute for sure
					// if above cases does not match
				default:
	
					// Print statement
					System.out.println("ENTER BETWEEN 0 TO 8.");
				}
	
			}
	
			// Checking condition at last where we are
			// checking case entered value is not zero
			while (choice != 0);

				break;

				// Case
			case 2:
				// obUser.User1();
				// obStudent.addStudent();
				
				StudentInfo s = new StudentInfo();
				obStudent.addStudent(s);
				break;

				default:

				// Print statement
				System.out.println("ENTER 1 or 2.");
				
}
}
while (choice1 != 0);
		
		// Creating menu
		// using do-while loop
}
}
