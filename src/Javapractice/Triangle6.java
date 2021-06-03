package Javapractice;

public class Triangle6
{
	public static void main(String[] args) 
	{
	
		for(int row=0;row<5;row++)
			
{
			char ch='A';

				
			for(int col=0;col<5;col++)
			{
				if(row>=col)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
}
			}
}
