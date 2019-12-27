import java.util.Scanner;
public class SumOfNaturalNumbersDivisibleByThreeOrFive {
	int calculateSum(int n){
		int count=0;
		int sum=0;
		int i=1;
		while(count<n){
			if(i%3==0 || i%5==0){
				sum=sum+i;
				i++;
				count++;
			}
			else{
				i++;
			}
		}return sum;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,sum;
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		SumOfNaturalNumbersDivisibleByThreeOrFive obj=new SumOfNaturalNumbersDivisibleByThreeOrFive();
		sum=obj.calculateSum(n);
		System.out.println("Sum of "+n+" natural numbers divisible by 3 or 5 is "+sum);
	}
}
