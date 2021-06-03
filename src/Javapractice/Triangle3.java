package Javapractice;

public class Triangle3 
{
	public static void main(String[] args)
	{
		
		for(int row=0;row<4;row++)
		{
			int count=1;
			for(int col=0;col<4;col++)
			{
				if(row+col>=3)
				{
					System.out.print(count+" ");
					count++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
			}
			
		}
		
		
	
}


