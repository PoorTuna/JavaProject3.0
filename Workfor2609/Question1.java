
public class Question1
{
	public static boolean isRishoni(int num)
	{// The function recieves an integer and checks if it is a prime number or not.
		if ( num == 1 || num == 0) 
			return false; 
		for (int i = 2 ; i < num ; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}

	
	public static void main(String[] args)
	{

		System.out.println(isRishoni(5));


		
	}

}
