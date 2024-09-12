package algorithm.recursion;

import java.util.Scanner;

public class FibonaaciExample {

	static int fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String args[])
	{
		//taking input from user
		System.out.println("Enter testcases : ");
		Scanner sc = new Scanner(System.in);
		//input testCase
		int t = sc.nextInt();

		while(t>0) {
			//input number
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			//call the factorial function
			long result = fibonacci(num);
			System.out.println("Fibonacci of "+num+" is : "+result);
			t--;
		}
		sc.close();
	}

}
