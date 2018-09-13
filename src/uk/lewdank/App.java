package uk.lewdank;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import uk.lewdank.UI.MainFrame;

public class App {
	
	public static void main(String[] args) {
		
		
		//create a new swing thread //why?
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//create a new JFrame
				JFrame frame = new MainFrame("Task Timetable");
				//set the size of the JFrame
				frame.setSize(800, 540);
				//terminate on cross click
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//make frame visible
				frame.setVisible(true);
			}
		});
	}

}
