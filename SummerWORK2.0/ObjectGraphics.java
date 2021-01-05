import unit4.canvasLib.*;
public class ObjectGraphics
{
	//
	private int objx = 0,objy = 0;
	private int angle = 0;
	private double scale = 1;
	private String color = "Yellow";
	private String backgroundColor = "White";
	//
	public ObjectGraphics()
	{
		this.objx = 0;
		this.objy = 0;
		this.angle = 0;
	}
	
	public ObjectGraphics(ObjectGraphics og)
	{
		this.objx = og.objx;
		this.objy = og.objy;
		
		this.angle = og.angle;
	}
	
	public ObjectGraphics(int x,int y,double scale,int angle)
	{
		this.objx = x;
		this.objy = y;
		
		this.scale = scale;
		this.angle = angle;
	}
	
	// 2.1 + 2.2
	public void setCaseColor (String color)
	{
		this.color = color;
	}
	
	public void setBackgroundColor(String color)
	{
		this.backgroundColor = color;
	}
	public void setPOS(int x, int y) // Change object pos
	{
		this.objx = x;
		this.objy = y;
	}
	
	public void changeFROMLASTPOS(int x,int y)
	{
		this.objx += x;
		this.objy += y;
	}
	
	//2.3
	public void copyObjectToNewLoc(int x,int y,int scale, int angle)
	{
		ObjectGraphics og1 = new ObjectGraphics(x,y,scale,angle);
		og1.updateCanvas();
	}
	
	
	//2.4
	public void setScale(double scale) // Change object size by scale
	{
		this.scale = scale;
	}
	
	
	//2.5
	public boolean equals(ObjectGraphics og) // Returns true if equal
	{
		if ( (this.objx == og.objx) && (this.objy == og.objy) && (this.angle == og.angle) && (this.scale == og.scale) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void updateCanvas()
	{
		Rectangle Background = new Rectangle (0,0,Integer.MAX_VALUE,Integer.MAX_VALUE,this.backgroundColor);
		Rectangle mainrect = new Rectangle(this.objx, this.objy,  (int)(200 * this.scale)  ,  (int)(300 * this.scale)  ,"black");
		
		Line leftframe = new Line(this.objx,this.objy,  this.objx  ,(int)((this.objy + 300) * this.scale),this.color);
		Line rightframe = new Line((int)((int)(this.objx + (200 * this.scale))) ,this.objy,(int)(this.objx + (200 * this.scale)),(int)((this.objy + 300) * this.scale),this.color);
		
		Rectangle bottomframe = new Rectangle(this.objx,(int)((this.objy + 275) * this.scale) ,(int)(200 * this.scale),(int)(25 * this.scale),this.color);
		Rectangle topframe = new Rectangle(this.objx,  this.objy  ,(int)(200 * this.scale) ,(int)(25 * this.scale),this.color);
		
		//bottom section
		
		//home button
		
		Square buttonframe = new Square((this.objx + (int)(95 * this.scale)) ,this.objy + (int)(280 * this.scale),(int)(15 * this.scale),"black");
		Circle button = new Circle((this.objx + (int)(102 * this.scale)) ,this.objy + (int)(287 * this.scale), (int)(3 * this.scale) ,"white");
		
		//top section
		
		//camera
		Triangle cameraframe = new Triangle((this.objx + (int)(103 * this.scale) ) ,(this.objy + 5), (int)(15 * this.scale) ,(int)(15 * this.scale), "black");
		Circle camerapoint = new Circle((this.objx + (int)(103 * this.scale)),(this.objy + 15),(int)(2 * this.scale),"white");
		
		//flashlight frame
		Rectangle leftbar = new Rectangle((this.objx + (int)(10 * this.scale)) ,(this.objy + 5) ,(int)(35 * this.scale) ,(int)(5 * this.scale) ,"black") ;
		Circle barpoint = new Circle((this.objx + (int)(13 * this.scale)),(this.objy + 7),(int)(2 * this.scale),"white");

	}
	
		public void screenAnimation()
		{
			Rectangle Background = new Rectangle (0,0,Integer.MAX_VALUE,Integer.MAX_VALUE,this.backgroundColor);
			Rectangle mainrect = new Rectangle(this.objx, this.objy,  (int)(200 * this.scale)  ,  (int)(300 * this.scale)  ,"black");
			
			Line leftframe = new Line(this.objx,this.objy,  this.objx  ,(int)((this.objy + 300) * this.scale),this.color);
			Line rightframe = new Line((int)((int)(this.objx + (200 * this.scale))) ,this.objy,(int)(this.objx + (200 * this.scale)),(int)((this.objy + 300) * this.scale),this.color);
			
			Rectangle bottomframe = new Rectangle(this.objx,(int)((this.objy + 275) * this.scale) ,(int)(200 * this.scale),(int)(25 * this.scale),this.color);
			Rectangle topframe = new Rectangle(this.objx,  this.objy  ,(int)(200 * this.scale) ,(int)(25 * this.scale),this.color);
			
			//bottom section
			
			//home button
			
			Square buttonframe = new Square((this.objx + (int)(95 * this.scale)) ,this.objy + (int)(280 * this.scale),(int)(15 * this.scale),"black");
			Circle button = new Circle((this.objx + (int)(102 * this.scale)) ,this.objy + (int)(287 * this.scale), (int)(3 * this.scale) ,"white");
			
			//top section
			
			//camera
			Triangle cameraframe = new Triangle((this.objx + (int)(103 * this.scale) ) ,(this.objy + 5), (int)(15 * this.scale) ,(int)(15 * this.scale), "black");
			Circle camerapoint = new Circle((this.objx + (int)(103 * this.scale)),(this.objy + 15),(int)(2 * this.scale),"white");
			
			//flashlight frame
			Rectangle leftbar = new Rectangle((this.objx + (int)(10 * this.scale)) ,(this.objy + 5) ,(int)(35 * this.scale) ,(int)(5 * this.scale) ,"black") ;
			Circle barpoint = new Circle((this.objx + (int)(13 * this.scale)),(this.objy + 7),(int)(2 * this.scale),"white");

			/// Animation Section : 
			int ballX = (int)((this.objx + 100) * this.scale); // value set to the middle of screen
			int ballY = (int)(((this.objy + 300) * this.scale) / 2) + (int)(20 * this.scale); //value set to the middle of the platforms
			int LplatX = (this.objx + 10) , RplatX = (int)((this.objx + 200)* this.scale) - (int)(10 * this.scale) ;
			
			//Ping Pong Game:
			Circle ball = new Circle(ballX,ballY, (int)(5 * this.scale), this.color);
			Rectangle leftPlatform = new Rectangle(LplatX , (int)((this.objy + 300) * this.scale) / 2, (int)(5 * this.scale) , (int)(40 * this.scale), this.color); // Left platform object
			Rectangle rightPlatform = new Rectangle(RplatX, (int)(((this.objy + 300) * this.scale) / 2), (int)(5 * this.scale) , (int)(40 * this.scale), this.color); // Right platform object	
		
			while (ballX != LplatX)
			{
				if (ball.getX() < LplatX)
						ball.move(3,0);
				else if(ball.getX() > RplatX)
						ball.move(-3,0);
			}
		}
	}
	
	
