import java.util.Scanner;

public class FibFinder {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); System.out.print("Enter a positive integer: ");
		int n = sc.nextInt();
		if(n < 0)
			main(null);
		else{
			System.out.println("The Fibonacci term is: " + fibIt(n)); // non-recursive
			System.out.println("The Fibonacci term is: " + fibRec(n)); } // recursive
	}
// non-recursive [ best for larger numbers. ]:
public static long fibIt(int n){
		long f = 1, a = 1, b = 1, c = 3;
		while(c <= n){
			f = a + b;
			a = b;
			b = f;
			c++;
		}return f;
	}
// recursive [ best for smaller numbers. ]:
	public static long fibRec(int n){
		if( n <= 2)
			return 1;
		else
			return fibRec(n-1) + fibRec(n-2);
	}
}
