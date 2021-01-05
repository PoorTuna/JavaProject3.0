
public class ObjectGraphicsMAIN
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ObjectGraphics og1 = new ObjectGraphics(0,0,1.5,0);
		
		og1.changeFROMLASTPOS(2, 2);
		og1.setPOS(0, 0);
		og1.setCaseColor("yellow");
		og1.setBackgroundColor("white");
		
		og1.updateCanvas();
		//og1.screenAnimation();
	}

}
