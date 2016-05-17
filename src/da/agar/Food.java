package da.agar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/**
 * 
 * @author 
 * @version 5.16.2016
 *
 */
public class Food implements Consumable, Drawable
{
	private Point2D myPoint;
	
	/**
	 * Create a food object with no location
	 */
	public Food()
	{
		myPoint = new Point2D.Double();
		myPoint.setLocation(0, 0);
	}
	
	/**
	 * Create a food object at the given location
	 * @param x the x location of the Food
	 * @param y the y location of the Food
	 */
	public Food(int x, int y)
	{
		myPoint = new Point2D.Double();
		myPoint.setLocation(x, y);
	}
	
	@Override
	public void paint(Graphics2D g2d)
	{
		g2d.fillOval((int) myPoint.getX(), (int) myPoint.getY(), 10, 10);
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
	
	public Color getColor()
	{
		int R = (int) (Math.random()*256);
		int G = (int) (Math.random()*256);
		int B = (int) (Math.random()*256);
		return new Color(R, G, B);

	}
}
