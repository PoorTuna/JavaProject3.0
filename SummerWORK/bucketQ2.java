import unit4.bucketLib.*;
public class bucketQ2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Bucket b1 = new Bucket(9,"Bucket1");
		Bucket b2 = new Bucket(4,"Bucket2");
		b1.fill(6);
		
		while(!(b1.isEmpty()))
		{
			b1.pourInto(b2);
			b2.empty();
		}
		
		
		
	}

}
