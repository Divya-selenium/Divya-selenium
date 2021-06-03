package Javapractice;

public class Pyramid2 {
	public static void main(String[] args) 
	{
		int n=3;
		int count=1;
		//lopgic for upper pyramid
		//loop to decide no of rows
		for (int rows=0;rows<n-1 ;rows++ )
		{
			
			
			//loop to decide no of spaces
			for (int spaces=0;spaces<n-1-rows ;spaces++ )
			{
				System.out.print("  ");
			}
			//loop to decide no of stars
			for (int col=0;2*rows>=col ;col++ )
			{
				
				System.out.print(count+" ");
				
			}
			count++;
			System.out.println();
		}
		//logic for inverse  pyramid
		//loop to decide no of rows
		
		for (int rows=n-1;rows>=0 ;rows-- )
		{
		
			//loop to decide no of spaces
			for (int spaces=0;spaces<n-1-rows ;spaces++ )
			{
				System.out.print("  ");
			}
			//loop to decide no of stars
			for (int col=0;2*rows>=col ;col++ )
			{
				System.out.print(count +" ");
				
			}
			count--;
			System.out.println();
		}
	}
}

