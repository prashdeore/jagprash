package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Please enter string to be reversed");
				String a= sc.next();
				String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
			System.out.println("Original String is "+a);	
			System.out.println("Reversed String is "+b);

	}

}
