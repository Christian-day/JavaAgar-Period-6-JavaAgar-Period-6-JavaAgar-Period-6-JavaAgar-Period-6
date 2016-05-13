package da.agar;

import java.awt.Graphics;
import java.awt.geom.Point2D;

public class Food implements Consumable, Drawable
{
	private Point2D myPoint;
	
	public Food()
	{
		myPoint = new Point2D.Double();
		myPoint.setLocation(0, 0);
	}
	
	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point2D getPoint()
	{
		return myPoint;
	}

	@Override
	public int getValue()
	{
		return 1;
	}

	@Override
	public int consume()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
