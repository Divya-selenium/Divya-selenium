package Javapractice;

public class Triangle8
{
	public static void main(String[] args) 
	{
		int count=0;
		
		for(int row=0;row<4;row++)
			
{
		
			

				for(int col=0;col<4;col++)
			{
					
				if(row>=col)
				{
					count++;
					System.out.print(count+" ");
					
					
				}
				else {
					System.out.print("  ");
				}
					
				}
				
			System.out.println();
					
			}
}
}
