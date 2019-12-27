import java.util.Scanner;

public class PowerOfTwoOrNot {
	public boolean getResult(int num){
		boolean result=false;
		if(num%2==0){
			result=true;
		}
		return result;
	}
	public static void main(String[] args){
		int num;
		boolean result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		PowerOfTwoOrNot obj=new PowerOfTwoOrNot();
		result=obj.getResult(num);
		if(result==true){
			System.out.println(num+" is a power of 2");
		}
		else{
			System.out.println(num+" is not a power of 2");
		}
	}
}
