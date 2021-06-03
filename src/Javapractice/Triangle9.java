package Javapractice;

public class Triangle9 
{
	public static void main(String[] args) 
	{
		

		char ch='A';
		for(int row=0;row<4;row++)
			
{
			

				for(int col=0;col<4;col++)
			{
					
				if(row>=col)
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
