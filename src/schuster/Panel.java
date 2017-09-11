package schuster;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.text.Document;

public class Panel extends JPanel{
	
	private JSlider s;
	private JTextField textFeld;
	private Control c;
	private Paint p;
	
	
	public Panel(Control c) {
		this.c=c;
		
		this.p= new Paint();
		this.setLayout(new BorderLayout());
		this.s=new JSlider(0,10);
		this.textFeld=new JTextField();
		
		
		this.add(s,BorderLayout.SOUTH);
		this.add(textFeld,BorderLayout.NORTH);
		this.add(p,BorderLayout.CENTER);
		
		Document doc= this.textFeld.getDocument();
		doc.addDocumentListener(this.c);
		s.addChangeListener(this.c);
	}

	
	
	
	
	
	
	public JSlider getS() {
		return s;
	}

	public void setS(JSlider s) {
		this.s = s;
	}

	public JTextField getTextFeld() {
		return textFeld;
	}

	public void setTextFeld(JTextField textFeld) {
		this.textFeld = textFeld;
	}

	public Control getC() {
		return c;
	}

	public void setC(Control c) {
		this.c = c;
	}

	public Paint getP() {
		return p;
	}

	public void setP(Paint p) {
		this.p = p;
	}
	
	
}
