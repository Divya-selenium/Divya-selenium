package Javapractice;

public class Primenumber3
{
	public static boolean isPrime(int num)
	{
		if(num<=0 || num==1)
		{
			return false;
		}		
		for (int count=2;count<=num/2 ;count++ )
		{
			if(num%count==0)
			{
				return false;
			}	
		}
		return true;
	}
	//Display the prime number between 1 to 100
	public static void main(String[] args) 
	
	{
			
		for (int num=1;num<=100;num++ )
		{
		boolean res=isPrime(num);
		if(res)
		{

			System.out.println(num);
				
		}
		}
	}
}

