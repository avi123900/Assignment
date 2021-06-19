interface  LibraryUser{
	default void registerAccount(int age) {
}
	default void requestBook(String bookType) {
		
	}}
class KidUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(int age) {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		if(age>12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String bookType) {
		if(bookType=="Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}
class AdultUser implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(int age) {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		if(age<12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook(String bookType) {
		if(bookType=="Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
}
	
public class LibraryInterfaceDemo {
	public static void main(String args[]) {
		LibraryUser ob=new KidUsers();
		ob.registerAccount(10);
		ob.requestBook("Kids");
		LibraryUser ob1=new KidUsers();
		ob1.registerAccount(18);
		ob1.requestBook("Fiction");
		LibraryUser ob3=new AdultUser();
		ob3.registerAccount(5);
		ob3.requestBook("Kids");
		LibraryUser ob4=new AdultUser();
		ob4.registerAccount(23);
		ob4.requestBook("Fiction");
		
	}

}

