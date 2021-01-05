import java.awt.Color;
import java.awt.color.*;
public class iphonemain
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		//main frame
		Rectangle mainrect = new Rectangle(100,100,200,300,"black");
		Line leftframe = new Line(100,100,100,400,"yellow");
		Line rightframe = new Line(300,100,300,400,"yellow");
		
		Rectangle bottomframe = new Rectangle(100,375,200,25,"yellow");
		Rectangle topframe = new Rectangle(100,100,200,25,"yellow");
		
		//bottom section
		
		//home button
		
		Square buttonframe = new Square(195,380,15,"black");
		Circle button = new Circle(202 ,387 ,3 ,"white");
		
		//top section
		
		//camera
		Triangle cameraframe = new Triangle(203,105, 15,15, "black");
		Circle camerapoint = new Circle(203,115,2,"white");
		
		//flashlight frame
		Rectangle leftbar = new Rectangle(110 ,105 ,35 ,5 ,"black") ;
		Circle barpoint = new Circle(113,107,2,"white");
		
	}
	
}
