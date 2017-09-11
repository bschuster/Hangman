package schuster;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
	
	public Frame(String titel, JPanel layout) {
		
		super(titel);
		this.add(layout);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500,500);
		this.setVisible(true);
	}
}
