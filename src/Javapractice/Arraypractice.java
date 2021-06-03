package Javapractice;



public class Arraypractice {

	public static void main(String[] args)
	{
		int [] ar ={1,2,3,3,4,5};
		int i;
		int j;
		int out;
		{
			for(i=0;i<ar.length-1;i++);
			{
				for (j=i+1;j<ar.length-1;j++);
				{
					if (ar[i]>ar[j]);
					{
						out=ar[j];
					
						ar[i]=out;
					}
					System.out.println(out);
					
						
				}
			}
			
		
        
	
	
		}
	}
}

