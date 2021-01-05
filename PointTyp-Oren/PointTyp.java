
public class PointTyp {

private int x = 0;
private int y = 0;
	
//Constructor - Default.
PointTyp()	
{	
this.x = 0;	
this.y = 0;	
	
}	
	
//Constructor - Straight.
PointTyp(int x, int y)	
{	
this.x = x;	
this.y = y;	
}	


//Constructor - Copy.
PointTyp(PointTyp par)	
{
this.x = par.x;	
this.y = par.y;
}


public void setX(int x)
	{
	this.x = x;
	}

public void setY(int y)
	{
	this.y = y;	
	}

public int getX()
	{
	return this.x;
	}

public int getY()
	{
	return this.y;
	}


				}
