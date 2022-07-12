package starpattern;
public class eg3 {
public static void main(String[] args)
{
	/**** 
	 *** 
	 **  
	 */
	int star=4;
	for(int i=1 ;i<=4;i++)//outer row-4
	{
	for(int j=1 ;j<=star;j++)//inner coloumn-4
	{
		System.out.print("* ");
	}
	star--;
	System.out.println();
}
}}
