package algorithm.recursion;

import java.util.Scanner;

public class FactorialExample {
	
	static long factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void main(String args[])
	{
		//taking input from user
		System.out.println("Enter the number to testcases : ");
		Scanner sc = new Scanner(System.in);
		//input testcase
		int t = sc.nextInt();
		
		while(t>0) {
		//input number
		System.out.println("Enter the number to find its factorial : ");
		int num = sc.nextInt();
		//call the factorial function
		long result = factorial(num);
		System.out.println("Factorial of "+num+" is : "+result);
		t--;
		}
		sc.close();
	}

}
