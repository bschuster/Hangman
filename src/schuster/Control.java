package schuster;

import javax.swing.event.*;

public class Control implements DocumentListener, ChangeListener{
	private Frame f;
	private Panel p;
	
	
	public Control() {
		
		this.p=new Panel(this);
		this.f=new Frame("Hangman", p);
		
		
	}
	
	
	public static void main(String[] args) {
		
		new Control();
		
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		this.p.getP().setZahl(p.getS().getValue());
		
	}


	@Override
	public void changedUpdate(DocumentEvent e) {
		
		
	}


	@Override
	public void insertUpdate(DocumentEvent e) {
		int wert=0;
		
		
		if (wert < 0 || wert > 10) {

            wert = -1;

        }
		
		try {

            wert = Integer.parseInt(p.getTextFeld().getText());

        }catch (NumberFormatException ex) {
            if (p.getTextFeld().getText().equals("")) {

                wert = 0;

            }else {

                wert = -1;

            }

        }

        if (wert < 0 || wert > 10) {

            wert = -1;

        }
		this.p.getP().setZahl(wert);
	}


	@Override
	public void removeUpdate(DocumentEvent e) {
		
		
	}


	public Frame getF() {
		return f;
	}


	public void setF(Frame f) {
		this.f = f;
	}


	public Panel getP() {
		return p;
	}


	public void setP(Panel p) {
		this.p = p;
	}


	
	
}
