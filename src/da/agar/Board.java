package da.agar;

import java.awt.Canvas;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
public class Board extends Canvas {
	public void paint(Graphics g){
		super.paint(g);
		g.drawLine(0, 0, 100, 100);
		g.drawLine(10, 10, 20, 300);
	}
	public static void main (String args[]){
		JFrame frame = new JFrame ("SLITHER.IO");
		frame.setSize(1000,1000);
		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("178.png")))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.pack();
		frame.paint();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
