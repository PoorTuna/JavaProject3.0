import unit4.turtleLib.*;
import java.util.*;
import java.awt.*;
import java.util.Random;
public class PointTypMain
{

	public static void main(String[] args)
	{
//		Random for x values.
		Random x1 = new Random();
		Random x2 = new Random();
		Random x3 = new Random();
		//
		//Random for y values.
		Random y1 = new Random();
		Random y2 = new Random();
		Random y3 = new Random();
		
		
	int	Xvalue1 = x1.nextInt(100)+1;
	int	Xvalue2 = x2.nextInt(100)+1;
	int	Xvalue3 = x3.nextInt(100)+1;
		
	int	Yvalue1 = y1.nextInt(100)+1;
	int	Yvalue2 = y2.nextInt(100)+1;
	int	Yvalue3 = y3.nextInt(100)+1;
	
		PointTyp p1= new PointTyp();
		PointTyp p2= new PointTyp();
		PointTyp p3= new PointTyp();
		
		
		p1.setX(60);
		p2.setX(Xvalue2);
		p3.setX(Xvalue3);
		
		p1.setY(60);
		p2.setY(Yvalue2);
		p3.setY(Yvalue3);
		
		if(((p1.getX()==p2.getX())||(p1.getX()==p3.getX())||(p2.getX()==p3.getX()))||((p1.getX()==p2.getX())||(p1.getX()==p3.getX())||(p2.getX()==p3.getX())))
			System.out.println("There are 2 numbers at least that are adjacents");
		else
			System.out.println("There are no numbers that are adjacents");
			
		if((p1.getY()>p2.getY())&&(p1.getY()>p3.getY()))
			System.out.println("The highest point is P1");
		else if((p2.getY()>p1.getY())&&(p2.getY()>p3.getY()))
			System.out.println("The highest point is P2");
		else
			System.out.println("The highest point is P3");
		
		
		Turtle t1 = new Turtle();
		Turtle t2 = new Turtle();
		Turtle t3 = new Turtle();
		
		//Draws a rectangle colored Red.
		t1.turnRight(90);
		t1.moveForward(150);
		t1.turnRight(90);
		t1.moveForward(90);
		t1.turnRight(180);
		
		t1.tailDown();
		t1.setTailColor(red);
		t1.turnRight(90);
		t1.moveForward(p1.getX());
		t1.turnRight(90);
		t1.moveForward(p1.getY());
		t1.turnRight(90);
		t1.moveForward(p1.getX());
		t1.turnRight(90);
		t1.moveForward(p1.getY());
		t1.tailUp();
		//Draws a rectangle colored Green.
		t2.turnRight(90);
		t2.moveForward(1000);
		t2.turnRight(90);
		t2.moveForward(90);
		t2.turnRight(180);
		
		t2.moveBackward(80);
		t2.tailDown();
		t2.setTailColor(green);
		t2.turnRight(90);
		t2.moveForward(p2.getX());
		t2.turnRight(90);
		t2.moveForward(p2.getY());
		t2.turnRight(90);
		t2.moveForward(p2.getX());
		t2.turnRight(90);
		t2.moveForward(p2.getY());
		
		//Draws a rectangle colored Blue.
		t1.turnRight(90);
		t1.moveForward(1000);
		t1.turnRight(90);
		t1.moveForward(150);
		t1.turnRight(180);
		
		t3.moveForward(80);
		t3.tailDown();
		t3.setTailColor(blue);
		t3.turnRight(90);
		t3.moveForward(p3.getX());
		t3.turnRight(90);
		t3.moveForward(p3.getY());
		t3.turnRight(90);
		t3.moveForward(p3.getX());	
		t3.turnRight(90);
		t3.moveForward(p3.getY());	
	}
	public static final Color red = new Color(255,0,0);
	public static final  Color green = new Color(0,255,0);
	public static final  Color blue = new Color(0,0,255);
	
}
