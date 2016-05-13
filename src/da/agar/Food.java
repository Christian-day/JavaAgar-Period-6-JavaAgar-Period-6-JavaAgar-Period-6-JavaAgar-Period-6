package da.agar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public class Food implements Consumable, Drawable
{
	private Point2D myPoint;
	
	public Food()
	{
		myPoint = new Point2D.Double();
		myPoint.setLocation(0, 0);
	}
	
	public Food(int x, int y)
	{
		myPoint = new Point2D.Double();
		myPoint.setLocation(x, y);
	}
	
	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		for (int i = 0; i < 400; i++)
		{
			g2d.fillOval((int) myPoint.getX(), (int) myPoint.getY(), 10, 10);
		}
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
