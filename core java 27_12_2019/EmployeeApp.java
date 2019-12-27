import java.util.Arrays;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee []employees=new Employee[10];
		
		employees[0]=new Employee(109,"yz","Salesman");
		employees[1]=new Employee(108,"vwx","Recruiter");
		employees[2]=new Employee(107,"stu","Partner");
		employees[3]=new Employee(106,"pqr","Manager");
		employees[5]=new Employee(104,"mno","HR");
		employees[6]=new Employee(105,"jkl","General Manager");
		employees[7]=new Employee(104,"ghi","Financial Advisor");
		employees[8]=new Employee(103,"def","Engineer");
		employees[9]=new Employee(102,"abc","Chairperson");
		employees[4]=new Employee(101,"Gargesh","Analyst");
		
		Arrays.sort(employees);
		for(int i=0;i<employees.length;i++)
			System.out.println(employees[i]);	
		}
}