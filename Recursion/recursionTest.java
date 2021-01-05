
public class recursionTest
{
	
	public static int count1(int x, int y)
	{
		if (y <= 0)
		{
			return(x); //5 x = 1
		}

		return (count1(x+1, y-1));
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		System.out.println(count1(4,2));	
		
		

	}

}
