import unit4.turtleLib.*;
public class TurtleName
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Turtle n1 = new Turtle();
		n1.moveBackward(100);
		n1.tailDown();
		
		
		n1.moveForward(100); // The letter O
		n1.turnRight(90);
		n1.moveForward(100);
		n1.turnRight(90);
		n1.moveForward(100);
		n1.turnRight(90);
		n1.moveForward(100);
		
		n1.tailUp(); // NBSP 1
		n1.moveBackward(150);
		n1.tailDown();
		
		
		n1.turnRight(90); // The letter R
		n1.moveForward(100);
		n1.moveBackward(10);
		n1.turnRight(90);
		n1.moveForward(50);
		
		n1.tailUp(); // NBSP 2
		n1.turnLeft(90);
		n1.moveForward(10);
		n1.turnRight(90);
		n1.moveForward(50);
		
		n1.tailDown(); // The letter E (Symbols represent the structure of the "E")
		n1.moveForward(50); // -
		n1.moveBackward(50);
		
		n1.turnRight(90); //  |
		n1.moveForward(50);
		
		n1.turnLeft(90);
		n1.moveForward(50); // -
		n1.moveBackward(50);
		
		n1.turnRight(90); //  |
		n1.moveForward(50);
		n1.turnLeft(90); //    -
		n1.moveForward(50);
		
		n1.tailUp(); // NBSP
		n1.moveForward(50);
		
		n1.tailDown();
		n1.turnLeft(90); // The letter N
		n1.moveForward(100);
		n1.turnRight(135);
		n1.moveForward(130);
		n1.turnLeft(135);
		n1.moveForward(100);

		
		
		
	}

}
