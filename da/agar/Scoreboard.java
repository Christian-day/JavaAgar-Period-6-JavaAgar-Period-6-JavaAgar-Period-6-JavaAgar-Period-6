package da.agar;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Scoreboard extends JTable{
	
	public static JTable makeScore (int n){
		JTable scoreboard = new JTable(n,2); 
		scoreboard.setGridColor(Color.red); 

		scoreboard.setValueAt("Players:", 0, 0);
		scoreboard.setValueAt("Score:", 0, 1);
		for (int j = 1 ; j< n; j++){
			scoreboard.setValueAt("Player "+j, j, 0);
			
		}


		return scoreboard;
}	
	public static void main (String args[]){
		//will eventually import players and info etc. from mitchell/anthony's classes
		JFrame test = new JFrame("test");
		test.setSize(1000, 1000);
		JTable scoreboard = makeScore(3);
		test.add(scoreboard);
		test.setVisible(true);
		/*JTable scoreboard = new JTable(4,2); 
		scoreboard.setGridColor(Color.red); 
		scoreboard.setVisible(true);

		scoreboard.setValueAt("Players", 0, 0);
		scoreboard.setValueAt("Score", 0, 1);

		test.setSize(1000, 1000);
		test.add(scoreboard);
		test.setVisible(true);*/



	}
}