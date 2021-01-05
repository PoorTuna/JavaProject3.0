public class Question2
{
	public static boolean is5_1(int[] array)
	{// The function recieves a sorted array and returns true if there is a couple that when are summed up equal to 5.
		int l = 0,h = array.length - 1,m = array.length/2;
		
		for (int i = 0 ; i < array.length; i ++)
			{
		if (array[m] >= 5)
		{
				h = m - 1 ;
				m = ( h - l ) / 2;
		}
		
		if( array[m] < 5)
		{
			if (array[m] + array[m-1] == 5)
				return true;
			else if( array[m] + array[m+1] == 5)
				return true;
		}
		
			}
		return false;
	}

	public static boolean is5_2(int[] array)
	{//The function recieves a sorted array and returns true if there is a couple that when are summed up equal to 5.
		for (int i = 0 ; i < array.length - 1 ; i++)
		{
			if (array[i] + array[i+1] == 5)
				return true;
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{

		int[] array = {1,2,3,5,6,7};
		System.out.println(is5_1(array));
		System.out.println(is5_2(array));
	}

}
