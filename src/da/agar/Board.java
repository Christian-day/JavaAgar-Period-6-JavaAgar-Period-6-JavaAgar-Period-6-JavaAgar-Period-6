package da.agar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Board extends Canvas {
	public static void main (String args[]){
		JFrame frame = new JFrame ("AGAR.IO");
		frame.setSize(1000,1000);
		frame.getContentPane().setBackground(Color.orange);
		
		ImageIcon icon = new ImageIcon("hello.png");//http://stackoverflow.com/questions/3775373/java-how-to-add-image-to-jlabel
		JLabel label = new JLabel();
		
		JButton button = new JButton ();
		button.setIcon(icon);
		button.setBounds(400, 10, 240, 60);
		label.add(button);
		frame.add(label);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
