package Javapractice;

public class Primenumber1 
	
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
		
		//Display first 5 Prime Number
		
		public static void main(String[] args) 
		
			{
					int count=5;
				for (int num=1;count>0;num++ )
				{
				boolean res=isPrime(num);
				if(res)
				{

					System.out.println(num);
					count--;	
				}
				}
			}
	}
				
	
