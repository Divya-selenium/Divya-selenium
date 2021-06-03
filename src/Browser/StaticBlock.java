package Browser;

class Demo
{
	static int a;
	static
	{
		System.out.println("block is executing");
		
	}
}
	public class StaticBlock
	{
	public static void main(String[] args)
	{
		System.out.println("start");
		System.out.println("a=" +Demo.a);
		

	}

}
