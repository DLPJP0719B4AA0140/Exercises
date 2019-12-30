import java.util.Scanner;

public class Details {
	public static void main(String[] args){
		String firstName="";
		String lastName="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name:");
		firstName=sc.nextLine();
		System.out.println("Enter last name:");
		lastName=sc.nextLine();
		Validate v=new Validate(firstName,lastName);
		v.getResult();
	}
}
