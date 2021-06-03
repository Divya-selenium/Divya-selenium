package Javapractice;

public class Triangle7 
{
	public static void main(String[] args) 
	{
	
		int n=15;
		for(int row=0;row<n;row++)
			
{
			char ch='a';

				
			for(int col=0;col<n;col++)
			{
				if(col+row>=n-1)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print("  ");
				}
					
				}
			System.out.println();
					
			}
	}
}
