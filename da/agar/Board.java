package da.agar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Board extends Scoreboard {

	public static void main (String args[]){
		
		
		final JFrame frame = new JFrame ("AGAR.IO");//creating jframe
		frame.setSize(1000,1000);
		frame.getContentPane().setBackground(Color.blue);
		
		
		ImageIcon icon = new ImageIcon("hello.png");//http://stackoverflow.com/questions/3775373/java-how-to-add-image-to-jlabel
		JLabel label = new JLabel();
		
		
		JButton button = new JButton ();//panel with agar io image
		button.setIcon(icon);
		button.setBounds(400, 10, 240, 60);
		
		JPanel panel = new JPanel();//home page panel
		panel.setSize(1000, 1000);
		panel.setBackground(Color.orange);
		
		
		final JPanel panel2 = new JPanel ();//in game panel
		panel2.setSize(1000, 1000);
		panel2.setBackground(Color.green);
		
		JButton button2 = new JButton ();//start button
		button2.setText("START");
		button2.setBounds(275, 300, 500, 250);
		button2.setFont(new Font("Comic Sans MS", Font.BOLD,80));
		button2.setBackground(Color.blue);
		button2.setForeground(Color.green);
		
		
		JButton button3 = new JButton ();//button that is a header to introduce our game 
		button3.setText("AGAR.IO by Danny, Tessa, Anthony, and Mitchell");
		button3.setBounds(400, 10, 240, 60);
		button3.setFont(new Font("Apple Casual", Font.BOLD,20));
		button3.setBackground(Color.blue);
		button3.setForeground(Color.blue);
		
		
		button2.addActionListener(new ActionListener(){//adding an action listener to the start button
			public void actionPerformed(ActionEvent e){
				frame.setContentPane(panel2);
				frame.invalidate();
				frame.validate();
				
			}
		});
		
		
		JButton button4 = new JButton ();//Score button
		button4.setText("Score:     ");
		button4.setBounds(800, 800, 60, 60);
		button4.setFont(new Font("Apple Casual", Font.BOLD,20));
		button4.setBackground(Color.blue);
		button4.setForeground(Color.blue);
		
		JTable scoreboard = makeScore(7);//creating scoreboard
		scoreboard.setBounds(1000, 500, 100, 100);
		
		panel2.add(scoreboard);
		panel2.add(button3);//adding stuff to in game panel
		panel2.add(button4);
		
		frame.add(button);//adding stuff to home page
		frame.add(button2);
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
