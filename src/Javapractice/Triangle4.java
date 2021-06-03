package Javapractice;

public class Triangle4 
{
	public static void main(String[] args) 
	{
		int n=15;
		
		for(int row=0;row<n;row++)

		{
			int count=0;
			
			
				for(int col=0;col<n;col++)
			
			{
				if(row+col<=n-1)
					
				{
					count++;
		
					System.out.print(count+" ");
					
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

