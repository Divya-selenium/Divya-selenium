package Javapractice;

public class Primenumber2 {
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
//Sum of First 5 Prime Number	
public static void main(String[] args) 

{
	int count=5;
	int sum=0;
for (int num=1;count>0;num++ )
{
boolean res=isPrime(num);
if(res)
{

	
	sum=num+sum;
	count--;	
}
}
System.out.println(sum);
}
}
