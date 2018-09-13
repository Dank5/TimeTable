package uk.lewdank.UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	public MainFrame(String title) {
		super(title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		// create swing component
		final JTextArea textArea = new JTextArea();
		JButton button = new JButton("Add Task");
		
		// add Swing components to content pane
		Container c = getContentPane();
		
		c.add(textArea, BorderLayout.PAGE_START);
		c.add(button, BorderLayout.SOUTH);
		
		// add behaviour
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//when the button is clicked
				textArea.append("New Task is now here!\n");
				
			}
		});
	}

}
