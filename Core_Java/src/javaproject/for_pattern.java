package javaproject;

public class for_pattern {
	
	public static void main(String[] args) {
		
	
	int i,j,k;
	
	
	for (i=0 ; i<10;i++)
	{
		for (k=0; k<9-i;k++)
		{
			System.out.print(" ");
		}
		
		for(j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
		}
	
	for (i=10-1; i>=0;i--)
 {
		for (k=0; k<9-i;k++)
		{
			System.out.print(" ");
		}
		
		for(j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
		}
		
	}
	
}
