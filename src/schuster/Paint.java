package schuster;

import java.awt.*;

import javax.swing.*;

public class Paint extends JPanel{
	private int zahl;

	
	public Paint() {
		this.zahl=0;
	}
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int width=this.getWidth();
		int height= this.getHeight();
		Color c=new Color(139,90,43);
		
		switch(zahl) {
			
			case -1:
				g.setColor(Color.RED);
				g.drawString("Bitte nur Zahlen von 0-10",10,100);
				break;
			
			case 0:
				break;
			
			case 1:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				break;
			
			case 2:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				break;
			
			case 3:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				break;
			
			case 4:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				
				g.drawLine((int)(0.6*width), (int)(0.2*height) ,(int)(0.6*width) , (int)(0.35*width));
				break;
			
			case 5:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				
				g.drawLine((int)(0.6*width), (int)(0.2*height) ,(int)(0.6*width) , (int)(0.35*width));
				
				c=new Color(238,213,210);
				g.setColor(c);
				g.fillOval((int)(0.55*width), (int)(0.39*height), (int)(0.1*width), (int)(0.1*width)  );
				break;
			
			case 6:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				
				g.drawLine((int)(0.6*width), (int)(0.2*height) ,(int)(0.6*width) , (int)(0.35*width));
				
				c=new Color(238,213,210);
				g.setColor(c);
				g.fillOval((int)(0.55*width), (int)(0.39*height), (int)(0.1*width), (int)(0.1*width)  );
				
				g.setColor(Color.BLUE);
				g.fillOval((int)(0.53*width), (int)(0.5*height), (int)(0.15*width), (int)(0.25*width)  );
				break;
				
			case 7:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				
				g.drawLine((int)(0.6*width), (int)(0.2*height) ,(int)(0.6*width) , (int)(0.35*width));
				
				c=new Color(238,213,210);
				g.setColor(c);
				g.fillOval((int)(0.55*width), (int)(0.39*height), (int)(0.1*width), (int)(0.1*width)  );
				
				g.setColor(Color.BLUE);
				g.fillOval((int)(0.53*width), (int)(0.5*height), (int)(0.15*width), (int)(0.25*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.55*width), (int)(0.55*height) ,(int)(0.48*width) , (int)(0.45*height));
				break;
				
			case 8:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				
				g.drawLine((int)(0.6*width), (int)(0.2*height) ,(int)(0.6*width) , (int)(0.35*width));
				
				c=new Color(238,213,210);
				g.setColor(c);
				g.fillOval((int)(0.55*width), (int)(0.39*height), (int)(0.1*width), (int)(0.1*width)  );
				
				g.setColor(Color.BLUE);
				g.fillOval((int)(0.53*width), (int)(0.5*height), (int)(0.15*width), (int)(0.25*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.55*width), (int)(0.55*height) ,(int)(0.48*width) , (int)(0.45*height));
				
				g.drawLine((int)(0.70*width), (int)(0.45*height) ,(int)(0.65*width) , (int)(0.55*height));
				break;
				
			case 9:
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				
				g.drawLine((int)(0.6*width), (int)(0.2*height) ,(int)(0.6*width) , (int)(0.35*width));
				
				c=new Color(238,213,210);
				g.setColor(c);
				g.fillOval((int)(0.55*width), (int)(0.39*height), (int)(0.1*width), (int)(0.1*width)  );
				
				g.setColor(Color.BLUE);
				g.fillOval((int)(0.53*width), (int)(0.5*height), (int)(0.15*width), (int)(0.25*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.55*width), (int)(0.55*height) ,(int)(0.48*width) , (int)(0.45*height));
				
				g.drawLine((int)(0.70*width), (int)(0.45*height) ,(int)(0.65*width) , (int)(0.55*height));
				
				g.drawLine((int)(0.55*width), (int)(0.7*height) ,(int)(0.48*width) , (int)(0.81*height));
				break;
				
			case 10:
				
				g.setColor(c);
				g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.5*width), (int)(0.3*width)  );
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.295*width), (int)(0.9*height) ,(int)(0.295*width) , (int)(0.2*height));
				
				g.drawLine((int)(0.295*width), (int)(0.2*height), (int)(0.6*width), (int)(0.2*height));
				
				g.drawLine((int)(0.6*width), (int)(0.2*height) ,(int)(0.6*width) , (int)(0.35*width));
				
				
				
				c=new Color(238,213,210);
				g.setColor(c);
				g.fillOval((int)(0.55*width), (int)(0.39*height), (int)(0.1*width), (int)(0.1*width)  );
				
				
				
				
				
				
				g.setColor(Color.BLACK);
				g.drawLine((int)(0.55*width), (int)(0.55*height) ,(int)(0.48*width) , (int)(0.45*height));
				
				g.drawLine((int)(0.70*width), (int)(0.45*height) ,(int)(0.65*width) , (int)(0.55*height));
				
				g.drawLine((int)(0.55*width), (int)(0.7*height) ,(int)(0.48*width) , (int)(0.81*height));
				
				g.drawLine((int)(0.70*width), (int)(0.8*height) ,(int)(0.65*width) , (int)(0.65*height));
				
				
				
				
				g.setColor(Color.BLUE);
				g.fillOval((int)(0.53*width), (int)(0.5*height), (int)(0.15*width), (int)(0.25*width)  );
				
				g.drawLine((int)(0.70*width), (int)(0.8*height) ,(int)(0.65*width) , (int)(0.65*height));
				break;
				
				
			
		}
		
		
		
		
		
		
		
	}

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
		this.repaint();
	}
	
	
	
}
