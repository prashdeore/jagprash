package starpattern;
public class Eg11 {
	public static void main(String[] args) {
//		1
//	   2 2 
//	  3 3 3 
//	 4 4 4 4   
//	  3 3 3 
//	   2 2 
//	    1
	  int space=3;
	  int num=1;
	  
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print(num+" ");
			}
			
			if(i<=3)
			{
				space--;
				num++;
			}
			else
			{
				space++;
				num--;
			}
			System.out.println();
		} 
	}
}
