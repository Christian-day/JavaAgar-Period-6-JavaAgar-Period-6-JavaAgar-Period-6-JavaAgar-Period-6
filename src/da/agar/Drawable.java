package da.agar;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public interface Drawable
{
	public void paint(Graphics2D g);
	
	public Point2D getPoint();
}
