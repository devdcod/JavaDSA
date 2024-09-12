package algorithm.recursion;

import java.util.Scanner;

public class BinarySearchExample {

	static int binarySearch(int arr[], int left, int right, int target)
	{
		while(left<=right)
		{
			int mid = left + (right - left)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(target<arr[mid])
			{
				return binarySearch(arr, left, mid-1, target);
			}
			else {
				return binarySearch(arr, mid+1, right, target);
			}
		}
		return -1;
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
			System.out.println("Enter size of array: ");
			int n = sc.nextInt();
			System.out.println("Enter array elements: ");
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter target number to be searched: ");
			int target = sc.nextInt();
			//call the factorial function
			int index = binarySearch(arr,0,n-1,target);
			if(index == -1)
			{
				System.out.println("Searched element not found");
			}
			else {
				System.out.println("Element found at index : "+ index);
			}
			t--;
		}
		sc.close();
	}

}
