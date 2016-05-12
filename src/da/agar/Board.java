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
	public static void main (String args[]){
		JFrame frame = new JFrame ("SLITHER.IO");
		frame.setSize(1000,1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
