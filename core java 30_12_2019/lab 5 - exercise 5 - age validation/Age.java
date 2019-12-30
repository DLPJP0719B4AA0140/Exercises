import java.util.*;
public class Age {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter age:");
		age=sc.nextInt();
		Validate v=new Validate(age);
		v.getResult();
	}
}
