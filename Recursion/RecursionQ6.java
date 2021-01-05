
public class RecursionQ6
{

	public static int recursion(int x,int y)
		{
			if (y <= 0)
			{
				return(1);
			}

			return (recursion(x, y-1) * x);
		}
	
	
	public static void main(String[] args)
	{
		System.out.println(recursion(2,3));
	}

}
