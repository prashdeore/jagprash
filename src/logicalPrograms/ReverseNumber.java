package logicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=7226;
		String strnum = Integer.toString(a);
		String rev="";
		for(int i=strnum.length()-1;i>=0;i--)
		{
			rev=rev+strnum.charAt(i);
		}
		int revnum = Integer.parseInt(rev);
		System.out.println("Original Number is "+a);
		System.out.println("Reverse Number is "+revnum);
	}

}
