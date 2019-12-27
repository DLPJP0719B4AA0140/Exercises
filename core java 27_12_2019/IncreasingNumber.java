import java.util.Scanner;
public class IncreasingNumber {
	public boolean getResult(int num){
		boolean result=true;
		int previous=9;
		int current;
		while(num>0){
			current=num%10;
			num=num/10;
			if(current>previous){
				result=false;
				break;
			}previous=current;
		}return result;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num;
		boolean result;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		IncreasingNumber obj=new IncreasingNumber();
		result=obj.getResult(num);
		if(result){
			System.out.println(num+" is an increasing number");
		}
		else{
			System.out.println(num+" is not an increasing number");
		}
	}
}
