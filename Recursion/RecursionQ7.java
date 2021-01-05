
public class RecursionQ7
{

	public  static  int  exe3 ( int  n )
	{
		if  ( n == 0 )
			return ( 0 ) ;
		else
			return (exe3( n / 10 ) + 1 )  ;
			
	}

	public static void main(String[] args)
	{
		System.out.println(exe3(27635));
	}

}
