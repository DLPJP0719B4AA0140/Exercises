import java.util.Arrays;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee [] employees=new Employee[3];
		
		employees[0]=new Employee(101,"Gargesh","EEE");
		employees[1]=new Employee(123,"Uttam","IT");
		employees[2]=new Employee(161,"Neel","CS");
		
		System.out.println("====================");
		System.out.println("Employee List Sorted By Name");
		Arrays.sort(employees);
		for(int i=0;i<employees.length;i++)
			System.out.println(employees[i]);	
		
		System.out.println("====================");
		System.out.println("Employee List Sorted By RollNo");
		
		CompareByRollNo r=new CompareByRollNo();
		
		Arrays.sort(employees,r);
		
		for(int i=0;i<employees.length;i++)
			System.out.println(employees[i]);
		
		System.out.println("====================");
		System.out.println("Employee List Sorted By Stream");
		
		CompareByStream s=new CompareByStream();
		
		Arrays.sort(employees,s);
		
		for(int i=0;i<employees.length;i++)
			System.out.println(employees[i]);
		
		
		

	}

}
