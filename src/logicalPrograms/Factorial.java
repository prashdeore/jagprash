package logicalPrograms;

public class Factorial {

	public static void main(String[] args) {
		int num=4;
		int fact=1;
		for(int i=num;i>=1;i--) //i=4,3,2,1
		{
			fact=i*fact; 
			//4=4*1
			//12=3*4
			//24=2*12
			//24=1*24
		}
		System.out.println("Factorial of number is "+fact);

	}

}
