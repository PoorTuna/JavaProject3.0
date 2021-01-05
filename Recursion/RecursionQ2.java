
public class RecursionQ2
{

	public static int recursion(int n)
	{
		
		if (n <= 1)
		{
			System.out.println(1);
			return (n);
		}
		else{
			return(recursion(n - 1) * n);
		}
		
	}

	
	
	
	
	public static void main(String[] args)
	{

			System.out.println(recursion(5));
		
		
	}

}
