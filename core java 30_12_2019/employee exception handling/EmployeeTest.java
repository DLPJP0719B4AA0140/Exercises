import java.util.*;
public class EmployeeTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String name, department;
		char choice;
		Employee[] empArray=new Employee[10];
		empArray[0]=new Employee(01,"Aakash","IT");
		empArray[1]=new Employee(02,"Akash","IT");
		empArray[2]=new Employee(03,"Bhakti","IT");
		empArray[3]=null;
		empArray[4]=null;
		empArray[5]=null;
		empArray[6]=null;
		empArray[7]=null;
		empArray[8]=null;
		empArray[9]=null;
		
		try {
			do {
				System.out.println("Enter employee id:\n");
					id = sc.nextInt();
					System.out.println("Enter employee name:\n");
					name = sc.next();
					System.out.println("Enter employee department:\n");
					department = sc.next();
					for (int i = 0; i < empArray.length; i++) {
						if (empArray[i]==null) {
							if (i>=9) {
								throw new MyException();
							}else{
								empArray[i] = new Employee(id, name, department);
								break;
							}
						}
					}
					System.out.println("Do you wish to continue? Y/N:\n");
					choice = sc.next().charAt(0); 
			} while (choice=='Y' || choice=='y');
		} catch (MyException exp) {
			System.out.println(exp);
		}
	}
}
