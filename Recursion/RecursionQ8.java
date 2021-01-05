
public class RecursionQ8
{

	public  static  int  exe4 ( int  n )
	{
		if  ( n == 1 )
			return ( n % 10 ) ;
		else
			return (exe4( n / 10 ))  ;
			
	}

	public static void main(String[] args)
	{
		System.out.println(exe4(12));
	}

}