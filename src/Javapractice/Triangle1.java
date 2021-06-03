package Javapractice;

public class Triangle1
{
public static void main(String[] args) 
{
	
	for(int row=0;row<5;row++)

	{
		int count=1;
		
		
			for(int col=0;col<5;col++)
		
		{
			if(row>=col)
				
			{
			
	
				System.out.print(count+" ");
				count++;
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

	


