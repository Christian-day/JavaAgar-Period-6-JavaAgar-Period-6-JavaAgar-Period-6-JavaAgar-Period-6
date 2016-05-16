package da.agar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.Random;

public class Agar implements  Growable, Drawable {
	public int xCoord;
	public int yCoord;
	public int height;
	public int width;
	public int rise;
	public int run;
	public Color color;
	public int panelHeight,panelWidth;
	//got this code from http://www.dreamincode.net/forums/topic/100531-how-to-create-a-circle-eclipse-that-will-move/
	public Agar(){
		setXCoord();
		setYCoord();
		setHeight();
		setWidth();
		setRise();
		setRun();
		setColor();
	}
	public void setXCoord(){
		int max = 51;
		Random rand = new Random();
		int tempX = rand.nextInt(max);
		xCoord = tempX;
	}
	public int getXCoord (){
		return(xCoord);
	}
	public void setYCoord() {
		  int max = 51;
		
		  Random rand = new Random();
		
		  int tempY = rand.nextInt(max);
		
		  yCoord = tempY;
		
		        
		
}//End setYCoord method
	
	public int getYCoord() {
	
		return(yCoord);
	
	}//End getYCoord method
		
	public void setHeight() {
	
		int max = 11;
	
		 Random rand = new Random();
	
		 int tempH = rand.nextInt(max) + 10;
	
		       height = tempH;
		
		   }//End setHeight method
	
		   public int getHeight() {
	
		       return(height);
	
		   }//End getHeight method
		
		   public void setWidth() {
	
		       int max = 11;
		
		       Random rand = new Random();
		
		       int tempW = rand.nextInt(max) + 10;
	
		       width = tempW;
	
		   }//End setWidth method
	
		   public int getWidth() {

		       return(width);
	
		   }//End getWidth method
	
		   public void setRise() {
		
		       int max = 11;
	
		       Random rand = new Random();
	
		       int tempR = rand.nextInt(max);
	
		       rise = tempR;
		   
		
		   }//End setRise method
	
		   public int getRise() {
	
		       return(rise);
	
		   }//End getRise method
	
		   public void setRun() {
	
		       int max = 11;
	
		       Random rand = new Random();
	
		       int tempR = rand.nextInt(max);
	
		       run = tempR;
	
		   }//End setRise method

		   public int getRun() {
	
		       return(run);
	
		   }//End getRun method
		
		   public void setColor() {

		       int red = (int)(Math.random() * 255);

		       int green = (int)(Math.random() * 255);

		       int blue = (int)(Math.random() * 255);

		       Color randomColor = new Color(red, green, blue);

		       color = randomColor;

		   }//End setColor method

		   public Color getColor() {

		       return(color);

		   }//End getColor method

		   public void paintComponent (Graphics g) {
	
		        g.setColor(color);

		        g.fillOval(xCoord, yCoord, width, height);
		
		    } // end method paintComponent
	
		   public void move() {
	
		        if (xCoord < (0 - run) || xCoord > (panelWidth - width)) {
	
		            run = -run;
	
		        }
		
		    if (yCoord < (0 - rise) || yCoord > (panelHeight - height)) {
		
		            rise = -rise;
	
		        }
		
		        // "Move" ball according to values in rise and run
		
		        xCoord += run;
		
		        yCoord += rise;
		
		   }//End move method
	
		  /* public void detectCollision(Ball b1, Ball b2){
	
		   }//End detectCollision method*/
		
		   public void setPanelHeight(int panelHeight) {
		
		        this.panelHeight = panelHeight;
		
		    }//End setPanelHeight
	
		    public void setPanelWidth(int panelWidth) {
		
		        this.panelWidth = panelWidth;
		
		    }//End setPanelWidth
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public Point2D getPoint() {
				// TODO Auto-generated method stub
				return null;
			}


}
