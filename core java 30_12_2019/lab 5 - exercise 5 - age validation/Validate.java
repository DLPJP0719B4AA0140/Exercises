
public class Validate {
	int age;
	Validate(int age){
		this.age=age;
	}
	public void getResult(){
		try {
			if(age<15){
				throw new MyException();
			}
			else if(age==15){
				System.out.println("Age = 15");
			}
			else{
				System.out.println("Age is: "+age);
			}
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}
