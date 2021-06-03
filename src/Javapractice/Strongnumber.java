package Javapractice;

public class Strongnumber {


	public static int isFact(int num)
	{
		int out=1;//output variable 
		while(num>1)
		{
			out=out*num--;
		}
		return out;
	}
	public static boolean isStrong(int num)
	{
		int result=0;
		int temp=num;
		while(num!=0)
		{
		int last=num%10;//extract last digit
		result=result+isFact(last);//caculate factorioal and add it to output variable 
		num=num/10;//eliminate last digit 
		}
		return (temp==result);	
	}
//logic of printing only first 3 strong numbers 

public static void main(String[] args) 
		{
			int count=4;
			int sum=0;
			for (int num=1;count>0;num++ )
			{
				boolean res=isStrong(num);
				if(res)
				{
				System.out.println(num);
				count--;
				sum=sum+num;
				}
			}
			System.out.println(sum);
		}
}

/*
//logic to display all strong number sfrom 1 to 10000
		public static void main(String[] args) 
		{
			for (int num=1;num<100000 ;num++ )
			{
				boolean res=isStrong(num);
				if(res)
				{
				System.out.println(num);
				}
			}
		}
}*/
	//logic to determine weather given num is striong or not 
/*	public static void main(String[] args) 
	{
		boolean res=isStrong(145);
		if(res)
		{
			System.out.println("Strong number....");
		}
		else
		{
			System.out.println("not Strong number....");
		}
	}*/