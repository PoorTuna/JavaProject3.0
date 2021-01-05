import unit4.bucketLib.*;
public class bucket
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Bucket b1 = new Bucket(10,"Bucket1");
		b1.fill(4);

		Bucket b2 = new Bucket(10,"Bucket2");
		b2.fill(2);
		
		b1.pourInto(b2);
		
		Bucket b3 = new Bucket(10,"Bucket3");
		for (int i = 1 ; i <= 4 ; i++)
		{
			b3 = new Bucket(10,"Bucket" + i);
			b3.fill(i * 2);
			
		}
		
		b3.pourInto(b2);
	}

}
