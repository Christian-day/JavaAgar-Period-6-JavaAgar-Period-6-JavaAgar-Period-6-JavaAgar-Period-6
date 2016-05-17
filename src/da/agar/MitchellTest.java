package da.agar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MitchellTest extends JPanel
{	
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		for(int i = 0; i < 150; i++)
		{	
			Food f = new Food((int) (Math.random()*1000), (int) (Math.random()*1000));
			g.setColor(f.getColor());
			f.paint(g2d);
		}
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Food Pieces");
		frame.add(new MitchellTest());
		frame.setSize(1000, 1000);
		frame.setVisible(true);
	}
}
