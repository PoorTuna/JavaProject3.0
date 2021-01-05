import java.awt.Color;
import unit4.turtleLib.*;
public class TurtleQ3
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Turtle t1 = new Turtle();
		
		t1.tailDown();
		
		t1.moveForward(100);
		t1.turnRight(90);
		
		t1.setTailColor(red);
		t1.moveForward(60);
		t1.turnRight(90);
		
		t1.setTailColor(green);
		t1.moveForward(100);
		t1.turnRight(90);
		
		t1.setTailColor(blue);
		t1.moveForward(60);
		
		t1.tailUp();
		
		t1.moveForward(100);
	}
	public final static Color red = new Color(255,0,0);
	public final static Color green = new Color(0,255,0);
	public final static Color blue = new Color(0,0,255);

}
