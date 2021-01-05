
public class RecursionQ5
{

	public static int count1(int x, int y)
	{
		if (y <= 0)
		{
			return(0);
		}

		return (count1(x, y-1)+x);
	}
	
	public static void main(String[] args)
	{

		System.out.println(count1(3,30));
		
	}

}
