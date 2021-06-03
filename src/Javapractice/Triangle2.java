package Javapractice;

public class Triangle2 
{
	public static void main(String[] args)
	{
		int count=1;
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<4;col++)
			{
				if(row>=col)
				{
					System.out.print(count+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			count++;
			System.out.println();
			
			}
			
		}
		
		
	
}
