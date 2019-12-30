
public class Validate{
	String firstName="";
	String lastName="";
	Validate(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public void getResult(){
		try {
			if(firstName.equals("")||lastName.equals("")){
				throw new MyException();
			}
			else{
				System.out.println("Program Terminated");
			}
		} catch (MyException exp) {
			System.out.println(exp);
		}
	}
}
