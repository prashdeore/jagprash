package logicalPrograms;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter a number");
	int a= sc.nextInt();
	if (a%2==0)
	{
		System.out.println("Given no is even");
	}
	else
	{
		System.out.println("Given no is odd");
	}
	
	
	}

}
