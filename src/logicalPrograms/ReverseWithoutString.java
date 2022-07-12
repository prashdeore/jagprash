package logicalPrograms;

public class ReverseWithoutString {

	public static void main(String[] args) {
		int num=1055;
		int revnum=0;
		for(int i=num;i>0;i=i/10)//4561,456,45,4
		{
			int rem=i%10;//1,6,5,4
			revnum=revnum*10+rem;	
		}
		System.out.println("Original Number is "+num);
		System.out.println("Reversed number is "+revnum);
		
	}

}
