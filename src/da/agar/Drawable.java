package src.da.agar;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public interface Drawable
{
	/**
	 * Given a Graphics2D context, draw the current object
	 * @param g a Graphics2D context to draw to
	 */
	public void paint(Graphics2D g);
	
	/**
	 * Get the location of the object
	 * @return The location of the Drawable object
	 */
	public Point2D getPoint();
}
