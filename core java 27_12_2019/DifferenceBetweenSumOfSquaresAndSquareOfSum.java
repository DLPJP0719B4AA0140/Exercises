import java.util.Scanner;
public class DifferenceBetweenSumOfSquaresAndSquareOfSum {
	public int calculateDifference(int n){
		int squareOfSum=0;
		int sumOfSquares=0;
		int sum=0;
		for(int i=1;i<=n;i++){
			sumOfSquares=sumOfSquares+(i*i);
		}
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		squareOfSum=sum*sum;
		int difference= sumOfSquares-squareOfSum;
		return difference;
	}
	public static void main(String[] args){
		int n, difference;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		DifferenceBetweenSumOfSquaresAndSquareOfSum obj=new DifferenceBetweenSumOfSquaresAndSquareOfSum();
		difference=obj.calculateDifference(n);
		System.out.println("Difference is: "+difference);
	}
}
