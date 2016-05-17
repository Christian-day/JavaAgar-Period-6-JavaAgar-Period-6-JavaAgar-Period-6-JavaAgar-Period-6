package src.da.agar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MitchellTest extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		for(int i = 0; i < 100; i++)
		{
			Food f = new Food((int) (Math.random()*500), (int) (Math.random()*500));
			f.paint(g2d);
			//figure out how to change colors
		}
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Food Pieces");
		frame.add(new MitchellTest());
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
