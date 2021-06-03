package Javapractice;

public class Conversion1 {
	public static String decTooct(int num)
	{
		String out="";
		while(num!=0)
		{
		int rem=num%8;
		out=rem+out;
		num=num/8;
		}
		return out;
	}
	public static void main(String[] args) 
	{
		String ans=decTooct(150);
		System.out.println(ans);
	}
}

