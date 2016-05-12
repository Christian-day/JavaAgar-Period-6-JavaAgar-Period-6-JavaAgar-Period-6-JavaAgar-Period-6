package da.agar;

import java.awt.Graphics;
import java.awt.geom.Point2D;

public interface Drawable
{
	public void paint(Graphics g);
	
	public Point2D getPoint();
}
