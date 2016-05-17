package da.agar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Random;
import java.awt.Component;

import javax.swing.JPanel;


public class Agar extends Component {//help from StackOFlow
	public int x;
	public int y;
	public int size;
	public Color color;
	
	public Agar(int x,int y,int size, Color c){
		this.x =x;
		this.y = y;
		this.size = size;
		this.color = c;
	}
	
	
	public static Agar agar = new Agar(800,100,40,Color.orange);
	
	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, size, size);
	}

}
